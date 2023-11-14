package polylecture;

import java.util.Arrays;

public class InterfaceLec {
    public static void main(String[] args) {

        // the abstract class modifier
        // a special kind of super class

        // use the Monster example and a couple of subclasses (keep it simple)
        // goblin and zombie
        Monster bob = new Goblin(); // Monster();
        bob.attack();

        // bob dies horribly

        bob = new Zombie();
        System.out.println(bob.getHealth());
        bob.attack();

        Monster fatBob = new FatGoblin();
        System.out.println(fatBob);
        fatBob.attack();

        // instantiate a goblin, then zombie, then try monster

        // add health, getter, setter, etc.
        // same benefits as regular inheritance except not meant to instantiate directly

        // also good place for abstract methods
        // what are abstract methods?

        // add an abstract method attack()
        // goblin's slash with a dagger
        // zombie's claw

        // create an array of monsters and have them all attack
        Monster [] monsters = new Monster[3];
        monsters[0] = new Goblin();
        monsters[1] = new Zombie();
        monsters[2] = new FatGoblin();

        System.out.println("----------------------");
        for (Monster monster : monsters) {
            monster.attack();
        }

        // refresh why abstract classes?


        // what is an interface
        // methods
        // abstract and default
        // constants only

        // create interface Dodger
        for (Monster monster : monsters) {
            if(monster instanceof Jumper) {
                // longhand way of temporarily casting monster as a jumper
                // and calling jump
                Jumper jumper = (Jumper) monster;
                jumper.jump();
                // shorthand way of doing it
//                ((Jumper) monster).jump();
            }
            if(monster instanceof AnnoyingCritter) {
                System.out.println("This monster is annoying");
            }
        }
        // use with Ninja and Goblin

        // limitations of an interface
        // see lesson
        // compare to abstract class

        // show comparable
        // show serializable
        Fighter [] fighters = new Fighter[3];
        fighters[0] = new Fighter();
        fighters[1] = new Fighter();
        fighters[2] = new Ninja();

        System.out.println(Arrays.toString(fighters));

        fighters[0].punch(fighters[1]);
        fighters[0].punch(fighters[1]);
        fighters[0].punch(fighters[2]);

        System.out.println(Arrays.toString(fighters));

        Arrays.sort(fighters); // try to sort based on health
        System.out.println(Arrays.toString(fighters));

        Jumper jumper = new Goblin();
        jumper.jump();

    }
}
