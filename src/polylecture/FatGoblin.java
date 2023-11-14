package polylecture;

public class FatGoblin extends Goblin {
    public FatGoblin() {
        health = 20;
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("The fat goblin sits on you.");
    }


}
