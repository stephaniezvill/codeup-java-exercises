package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String input = scanner.nextLine().toLowerCase();
        return input.equals("y") || input.equals("yes");
    }

    public int getInt(int min, int max) {
        int input = 0;
        do {
            input = scanner.nextInt();
            if (input < min || input > max) {
                System.out.println("Invalid input. Please enter a number between " + min + " and " + max);
            }
        } while (input < min || input > max);
        return input;
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double input = 0;
        do {
            input = scanner.nextDouble();
            if (input < min || input > max) {
                System.out.println("Invalid input. Please enter a number between " + min + " and " + max);
            }
        } while (input < min || input > max);
        return input;
    }

    public double getDouble() {
        return scanner.nextDouble();
    }
}
