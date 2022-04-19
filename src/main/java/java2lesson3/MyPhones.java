package java2lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MyPhones {
    private HashMap<String, List<String>> phonebook;

    public MyPhones() {
        this.phonebook = new HashMap<>();
    }

    public void add(String surname, String number) {
        if (phonebook.containsKey(surname)) {
            List<String> numbers = phonebook.get(surname);
            if (!numbers.contains(number)) {
                numbers.add(number);
                System.out.println(String.format("Phone number %s added for surname %s", number, surname));
            } else {
                System.out.println(String.format("Phone number %s already exists for surname %s", number, surname));
            }
        } else {
            phonebook.put(surname, new ArrayList<>(Arrays.asList(number)));
            System.out.println(String.format("Phone number %s added for surname %s", number, surname));
        }
    }

    public List<String> get(String surname) {
        if (phonebook.containsKey(surname)) {
            return phonebook.get(surname);
        } else {
            System.out.println(String.format("Phone number does not exist %s", surname));
            return new ArrayList<>();
        }
    }
}
