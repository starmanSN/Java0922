package homework2;

import homework1.first.Person;

import java.util.LinkedList;

public class LinkedListMethods {

    public static void main(String[] args) {
        LinkedList<Person> people = new LinkedList<>();
        people.add(Person.builder()
                .setFirstName("John")
                .setLastName("Snow")
                .setCountry("Vesteros")
                .setGender("male")
                .setAge(20)
                .build());

        people.add(Person.builder()
                .setFirstName("Vin")
                .setLastName("Diesel")
                .setCountry("USA")
                .setGender("male")
                .setAge(50)
                .build());

        people.add(Person.builder()
                .setFirstName("Vasya")
                .setLastName("Pupkin")
                .setCountry("Russia")
                .setGender("male")
                .setAge(99)
                .build());

        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));

        }
        System.out.println(people.size());

        people.removeLast();
        for (Person s : people) {
            System.out.println(s);
        }
        System.out.println(people.size());
    }
}
