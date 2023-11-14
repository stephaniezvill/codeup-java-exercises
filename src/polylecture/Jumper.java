package polylecture;

public interface Jumper {
    public final int DEFAULT_JUMPHEIGHT = 10;

    public abstract void jump();

    public default void highJump() {
        System.out.println("The jumper high jumps.");
    }



}
