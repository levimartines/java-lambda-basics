package io.levimartines.exercises;

import io.levimartines.Person;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Unit1Exercise {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
            new Person("Chalie", "Brown", 33),
            new Person("Marie", "Currie", 99),
            new Person("Magnus", "Carlsen", 27),
            new Person("Chico", "Xavier", 66),
            new Person("Seu", "Zé", 9999),
            new Person("Ronald", "Mc'Donald", 48)
        );

        // Step 1 : Sort list by last name
        // personList.sort((p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
        personList.sort(Comparator.comparing(Person::getLastName));

        // Step 2 : Create a method that prints all the elements in the list
        System.out.println("Printing all persons");
        printConditionally(personList, p -> true);
        System.out.println();

        // Step 3 : Create a method that prints all people that have last name beginning with C
        System.out.println("Printing all persons that last name starts with C");
        printConditionally(personList, p -> p.getLastName().startsWith("C"));
    }

    private static void printConditionally(List<Person> personList, Condition condition) {
        personList.forEach(person -> {
            if (condition.test(person)) {
                System.out.println(person);
            }
        });
    }

}

interface Condition {

    boolean test(Person p);
}
