import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("Enter an integer from 1 to 10:");
            int number = scanner.nextInt();
            while (number < 1 || number > 10) {
                System.out.println("Invalid number. Please enter an integer from 1 to 10:");
                number = scanner.nextInt();
            }
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);
            System.out.println("Do you want to continue? (yes/no)");
            input = scanner.next();
        } while (input.equalsIgnoreCase("yes"));
    }
}