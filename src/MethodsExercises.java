import java.util.Scanner;

public class MethodsExercises {
    private static Scanner input = new Scanner(System.in);

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
//        return a * b;
        double sum = a;

        if(b == 0) {
            return 0;
        }
        for (int i = 1; i < b; i++) {
            sum += a;
        }
        return sum;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }

    public static int getInteger(int min, int max) {
        System.out.printf("Enter a number from %d to %d: ", min, max);
        if(input.hasNextInt() == false) {
            // user typed in garbage so make em do it again
            // first get rid of the garbage in the keyboard buffer
            input.nextLine();
            return getInteger(min, max);
        }
        int num = input.nextInt();
        // make sure the num is in the right range. if not ask the user to do it again
        if (num >= min && num <= max) {
            return num;
        }
        // else make em do it again
        return getInteger(min, max);
    }

    public static long fact(long n) {
        // hallmark #2 (a way to stop)
        if(n == 1 || n == 2) {
            return n;
        }

        // hallmark #1 (answer is in smaller terms of itself)
        return n * fact(n - 1);
    }

    public static void roll2Dice(int numSides) {
        int die1 = randomInt(1, numSides);
        System.out.println("You rolled a " + die1);

        int die2 = randomInt(1, numSides);
        System.out.println("You rolled a " + die2);

    }

    // return a random # between low and high INCLUSIVE
    public static int randomInt(int low, int high) {
        return (int) Math.floor(Math.random() * (high - low + 1) + low);
    }

    public static void main(String[] args) {
//        System.out.println(fact(5));

        System.out.print("Enter the number of sides for a pair of dice: ");
        int sideNum = input.nextInt();
        input.nextLine();

        System.out.println("Press Enter to roll some dice!");
        input.nextLine();

        roll2Dice(sideNum);

        System.out.print("Roll the dice again (y/n)? ");
        String choice = input.nextLine().trim();
        if(choice.equalsIgnoreCase("Y")) {
            roll2Dice(sideNum);
        }


//        int userInput = getInteger(1, 10);
//        System.out.println(userInput);


//        System.out.println(add(1, 2));
//        System.out.println(subtract(1, 2));
//        System.out.println(multiply(1, 2));
//        System.out.println(divide(1, 2));
//        System.out.println(modulus(5, 3));
//
//        System.out.println(multiply(5, 0));
//        System.out.println(multiply(5, 6));

        input.close();
    }
}
