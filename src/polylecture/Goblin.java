package polylecture;

import java.io.Serializable;

public class Goblin extends Monster implements Jumper, AnnoyingCritter {
    @Override
    public void attack() {
        System.out.println("The goblin slashes you.");
    }

    @Override
    public void jump() {
        System.out.println("The goblin jumps pretty high.");
    }

}
