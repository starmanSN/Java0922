package homework1.first;

public class Main {

    public static void main(String[] args) {
        Person person = Person.builder()
                .setFirstName("Dan")
                .setAge(30)
                .setCountry("USA")
                .build();
        System.out.println(person);

    }
}
