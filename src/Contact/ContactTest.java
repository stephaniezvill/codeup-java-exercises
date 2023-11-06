package Contact;

public class ContactTest {
    public ContactTest() {
    }

    public static void main(String[] args) {
        //Constructor
        //instantiation creates on an instance of contact (instantiate an object)
        //Declaring a reference variable
        //create a new object
        //Assign object to reference variable
        Contact javier = new Contact();
        javier.name = "Javier";
        javier.mobile = "2105558899";
        javier.email = "javier.ruedas@codeup.edu";
        //Contact() is a kind of method called
        //constructor
        //invoke a constructor with the keyword "new"
        //followed by the name of a class,parens, and a semicolon
        Contact ibm = new Contact();
        ibm.name = "IBM";
        ibm.mobile = "5168675309";
        ibm.email = "contact@ibm.com";

        Contact mikeHoncho = new Contact ("Mike Honcho",
       "56890253",
       "mike@honcho.com");
        System.out.println(mikeHoncho.display());

        System.out.println(javier.display());

        System.out.println((ibm.display()));
//this displays a representation of the memory address
//        System.out.println(javier);

    }
}
