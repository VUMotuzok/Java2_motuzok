package java2lesson3;

import java.util.*;

public class MyUniqueWords {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "Java", "Python", "PHP", "GoLang", "JavaScript", "1C",
                "PostgreSQL", "Java", "C", "C++", "Java"
        );

        Set<String> uniqueWords = new HashSet<String>(words);

        System.out.println("My words");
        System.out.println(words.toString());
        System.out.println("My unique words");
        System.out.println(uniqueWords.toString());
        System.out.println("Number of repetitions");
        for (String key : uniqueWords) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}
