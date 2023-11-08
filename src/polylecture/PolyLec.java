package polylecture;

import polylecture.Fighter;
import polylecture.Ninja;

public class PolyLec {
    public static void main(String[] args) {

        // make a Fighter class with a health property a punch(Fighter) method
        // also add a toString method

        // declare two fighters and do some punching!
        Fighter bob = new Fighter();
        Fighter tom = new Fighter();
        bob.punch(tom);

        System.out.println("Bob: " + bob);
        System.out.println("Tom: " + tom);

        // make a subclass/subtype of Fighter called Ninja
        // explain inheritance and why it is awesome
        Ninja sue = new Ninja();
        System.out.println("Sue: " + sue);

        // show how a ninja can punch like a fighter
        sue.punch(tom);
        System.out.println("Tom: " + tom);

        // explain superclass/supertype


        // add a ninja-cool attack: throwShuriken

        // fight some more
        sue.throwShuriken(tom);
        sue.throwShuriken(bob);
        System.out.println("Tom: " + tom);
        System.out.println("Bob: " + bob);

        // this didn't use to work in the old days
        // and will not work in classes that are outside Fighter's package
//        System.out.println(bob.health);

        // add a protected property strength and have punch() use it
        // set the ninja's strength a little lower than the fight
        // show how it can easily be accessed between the classes with protected

        // explain when to use protected. change health to protected also

        // define a ninja-specific property: numShuriken
        //  and add a getter/setter


        // now add a Fighter method taunt()
        bob.taunt();

        // and override taunt() in Ninja
        sue.taunt();

        // point at toString() and how it overrides. what is it overriding???

        // what if the ninja wants to do both kinds of taunts?
        // show super

        // how can ninja use the fighter's constructor to init itself?
        // to reuse the fighter's initialization for health???

        // refresh: why inheritance?

        // polymorphism
        // go beyond the lesson's definition
        // point to solid principles reference
        // https://en.wikipedia.org/wiki/SOLID


        // now let's have an Arena of fighters and ninjas with a loop to have them all taunt
        // use abstract references to store fighters and ninjas together!

        Fighter [] arena = new Fighter[4];
        arena[0] = new Fighter();
        arena[1] = new Fighter();
        arena[2] = new Fighter();
        arena[3] = new Ninja();

        // what if we wanted everyone to punch a fighter called targetDummy?
        for (Fighter fighter : arena) {
            if(fighter instanceof Ninja) {
                ((Ninja) fighter).throwShuriken(tom);
            } else {
                fighter.punch(tom);
            }
        }

//        Fighter weirdNinja = new Ninja();

        // how can we have the ninja's instead throw shuriken at the targetDummy?

        // refresh: why abstract references?

        // final
        // class (cannot extend)
        // property (assign only once)
        // method (cannot override)
    }
}
