import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.toString(numbers));

        Person [] people = new Person[3];
        people[0] = new Person("bob");
        people[1] = new Person("sue");
        people[2] = new Person("tom");

        printMyPeople(people);

        Person [] morePeople = addPerson(people, new Person("betsy"));

        printMyPeople(morePeople);
    }

    private static Person [] addPerson(Person[] ppl, Person person) {
        // create an array that is 1 larger than ppl.length()
        // copy all the people in ppl to the new array
        Person [] morePpl = Arrays.copyOf(ppl, ppl.length + 1);

        // throw person at the end of the array
        morePpl[morePpl.length - 1] = person;

        return morePpl;
    }

    private static void printMyPeople(Person[] ppl) {
        for (Person person : ppl) {
            System.out.println(person);
        }
    }
}
