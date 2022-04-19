package java2lesson3;

public class MainPhones {
    public static void main(String[] args){
        System.out.println("Let's start! Creating my phonebook...");
        MyPhones phonebook = new MyPhones();
        System.out.println("*--*--*--*--*--*--*--*--*");

        System.out.println("Let's complete the phonebook!");
        phonebook.add("Motuzok", "89537021151");
        phonebook.add("Gubanova", "89014567232");
        phonebook.add("Samoylova", "895678132");
        phonebook.add("Motuzok", "89537021152");
        phonebook.add("Motuzok", "89546783452");
        phonebook.add("Repin", "89107545362");
        System.out.println("*--*--*--*--*--*--*--*--*");

        System.out.println("Get data.......");
        System.out.println("Motuzok phonenumber(s)");
        System.out.println(phonebook.get("Motuzok"));
        System.out.println("Gubanova phonenumber(s)");
        System.out.println(phonebook.get("Gubanova"));
        System.out.println("Repin");
        System.out.println(phonebook.get("Repin"));
        System.out.println("*--*--*--*--*--*--*--*--*");

        System.out.println("no data, sorry!");
        System.out.println("Saluscheva");
        System.out.println(phonebook.get("Saluscheva"));
        System.out.println("*--*--*--*--*--*--*--*--*");

        System.out.println("Trying to add ...");
        phonebook.add("Motuzok", "89537021151");
        System.out.println("Motuzok");
        System.out.println(phonebook.get("Motuzok"));
    }
}
