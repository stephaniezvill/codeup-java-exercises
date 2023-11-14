package polylecture;

public class Zombie extends Monster {

    public void poisonBreath() {
        System.out.println("The zombie breathes nastiness on you.");
    }

    @Override
    public void attack() {
        poisonBreath();
    }
}
