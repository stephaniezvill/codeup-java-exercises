import java.util.Scanner;

public class DiceRollingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of sides for the dice:");
        int sides = scanner.nextInt();

        boolean keepRolling = true;
        while (keepRolling) {
            int die1 = rollDice(sides);
            int die2 = rollDice(sides);
            System.out.println("You rolled " + die1 + " and " + die2 + ".");

            System.out.println("Do you want to roll the dice again? (yes/no)");
            String response = scanner.next();
            keepRolling = response.equalsIgnoreCase("yes");
        }
    }

    public static int rollDice(int sides) {
        return (int) ((Math.random() * sides) + 1);
    }
}