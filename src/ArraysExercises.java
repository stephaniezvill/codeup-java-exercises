class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

public class ArraysExercises {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("Alice");
        people[1] = new Person("Bob");
        people[2] = new Person("Charlie");

        for (Person person : people) {
            System.out.println(person.name);
        }

        Person newPerson = new Person("David");
        people = addPerson(people, newPerson);

        for (Person person : people) {
            System.out.println(person.name);
        }
    }

    public static Person[] addPerson(Person[] people, Person newPerson) {
        Person[] newPeople = new Person[people.length + 1];
        System.arraycopy(people, 0, newPeople, 0, people.length);
        newPeople[people.length] = newPerson;
        return newPeople;
    }
}
