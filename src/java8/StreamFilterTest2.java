package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

record Person (String name, int age){}

/**
 *  Experiment 1: filter Person by name
 *
 *  Experiment 2: sort Person by name
 */
public class StreamFilterTest2 {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("mkyong",30));
        persons.add(new Person("jack",38));
        persons.add(new Person("jack",25));
        persons.add(new Person("lawrence",40));
        persons.add(new Person("lawrence",28));

/*        getStudentByName(persons,"jack");
        getStudentByName(persons,"sandy");*/

        //sortStudentByName(persons);

        sortStudentByNameAge(persons);
    }

    private static void getStudentByName(List<Person> persons, String name)
    {
        Optional<Person> result = persons.stream().filter(person ->person.name().equals(name)).findFirst();
        System.out.println(result.map(person -> "Found: "+person.name()).orElse("Not Found: "+name));

    }

    private static void sortStudentByName(List<Person> persons)
    {
        List<Person> sorted = persons.stream().sorted(Comparator.comparing(Person::name)).collect(Collectors.toList());
        System.out.println(sorted);
    }

    private static void sortStudentByNameAge(List<Person> persons)
    {
        List<Person> sorted = persons.stream().sorted(Comparator.comparing(Person::name).thenComparing(Person::age)).collect(Collectors.toList());
        System.out.println(sorted);
    }

}
