package animals;

import contact.Contact;

public class SlothTest {
    public SlothTest() {
    }

    public static void main(String[] args) {
        Sloth cloud = new Sloth();
        cloud.setName("Cloud");
        cloud.setSound("Meeping");

        Contact fidel = new Contact ("fidel","meeping");
        System.out.println(fidel.display());

        System.out.println(cloud.makeNoise());
    }
}
