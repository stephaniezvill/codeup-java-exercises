package Animals;

import Contact.Contact;

public class SlothTest {
    public SlothTest() {
    }

    public static void main(String[] args) {
        Sloth cloud = new Sloth();
        cloud.name = "Cloud";
        cloud.sound = "Meeping";

        Contact fidel = new Contact ("fidel","meeping");
        System.out.println(fidel.display());

        System.out.println(cloud.makeNoise());
    }
}
