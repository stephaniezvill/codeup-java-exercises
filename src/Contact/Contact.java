//blueprint/template
package Contact;

public class Contact {

    public String name;
    public String mobile;
    public String email;

    public Contact(String fidel, String meeping) {

    }

    public String checkNull(String contactProperty) {
        return contactProperty == null ? " ": contactProperty;
    }
    public String display() {
        return String.format(
                "Name:%s%n"+
                "Mobile:%s%n"+
                "Email:%s%n",
                name,checkNull(mobile),checkNull(email)
        );
    }
    public Contact (){
        System.out.println("New contact!");
    }
    public Contact (String name, String mobile, String email) {
        this.name = name;
        this.mobile = mobile;
        this.email = email;
    }

}
