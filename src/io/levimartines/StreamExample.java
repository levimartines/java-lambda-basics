package io.levimartines;

import io.levimartines.exercises.Person;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
            new Person("Chalie", "Brown", 33),
            new Person("Marie", "Currie", 99),
            new Person("Magnus", "Carlsen", 27),
            new Person("Chico", "Xavier", 66),
            new Person("Seu", "Zé", 9999),
            new Person("Ronald", "Mc'Donald", 48)
        );

        // Permite o processamento paralelo dos dados ( se possível )
        List<String> personLastNameStartsWithC = personList.parallelStream()
            .filter(p -> p.getLastName().startsWith("C"))
            .map(Person::getLastName)
            .map(string -> string = "Last name: " + string)
            .collect(Collectors.toList());

        personLastNameStartsWithC.forEach(System.out::println);

    }


}

