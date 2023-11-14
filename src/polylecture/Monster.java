package polylecture;

public abstract class Monster {
    protected int health;

    public Monster() {
        health = 10;
    }

    public abstract void attack();

    @Override
    public String toString() {
        return "Monster{" +
                "health=" + health +
                '}';
    }


    // accessors booo

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
