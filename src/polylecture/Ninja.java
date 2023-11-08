package polylecture;

// subclass
// subtype
public class Ninja extends Fighter {
    private int numShuriken;

    // ninja can taunt like a fighter + their own special ninja taunt
    @Override
    public void taunt() {
        System.out.println("The ninja glares menacingly.");
        super.taunt();
    }

    public Ninja() {
        // this does NOT?!? need to be explicitly called
        // will still do super() constructor
//        super();
        strength = 5;
        numShuriken = 5;
    }

    public void throwShuriken(Fighter poorBastard) {
        // a ninja can throw up to 3 shuriken
        // but no more than the initial 5 total
        int tempHealth = poorBastard.health;
        for (int i = 0; i < 3; i++) {
            if(numShuriken == 0) {
                break;
            }
            System.out.println("Zing!");
            tempHealth -= 3;
            numShuriken--;
        }
        poorBastard.setHealth(tempHealth);
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "numShuriken=" + numShuriken +
                ", health=" + health +
                ", strength=" + strength +
                '}';
    }
}
