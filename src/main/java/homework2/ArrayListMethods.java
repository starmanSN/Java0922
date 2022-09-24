package homework2;

import homework1.first.Person;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        persons.add(Person.builder()
                .setFirstName("Goblin")
                .build());
        persons.add(Person.builder()
                .setFirstName("Sam")
                .build());

        Person someone = persons.get(0);

        System.out.println(someone);
        System.out.println(persons.contains(someone));

        for (Person p: persons) {
            persons.remove(p);
        }
        System.out.println(persons);
    }
}
