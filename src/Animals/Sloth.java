package Animals;

public class Sloth {
    private String name;
    private String sound;

    public void setName(String name) {
        this.name = name;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    Sloth(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public Sloth() {

    }


    public String makeNoise() {
    return name  +  " goes "  +  sound;
    }
}

