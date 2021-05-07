package io.levimartines;

import io.levimartines.exercises.Person;
import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
            new Person("Chalie", "Brown", 33),
            new Person("Marie", "Currie", 99),
            new Person("Magnus", "Carlsen", 27),
            new Person("Chico", "Xavier", 66),
            new Person("Seu", "Zé", 9999),
            new Person("Ronald", "Mc'Donald", 48)
        );

        // Usando lambda forEach loop
        personList.forEach(System.out::println);

    }


}

