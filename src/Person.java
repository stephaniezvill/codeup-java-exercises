public class Person {
    private String name;
    //constructor
    public Person(String name) {
        this.name = name;
    }
    //getter and setter methods
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Main {
    public static void main(String[] args) {
        Person person = new Person("John Doe");
        System.out.println("Name: " + person.getName());

        person.setName("Jane Doe");
        System.out.println("Updated Name: " + person.getName());
    }
}