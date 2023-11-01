import java.util.Scanner;

public class consoleIOlecture {
    public static void main(String[] args) {
        String cohort = "Hippogriff";
        byte week = 9;
        double completionPercentage = 38.7525;
        System.out.printf("Hello, %s, welcome to week %d!!! You are %.4f%% of the wy through.%n", cohort, week, completionPercentage);
        System.out.println("Is this going to be on a new line?");
        //create a scanner object
        // set it to scan the command line for input
        Scanner scanner = new Scanner(System.in);
        //output to command line
//        System.out.println("Say something:");
        //use my scanner object to get the user input
        //.ext only captures until the first space
//        String userInput = scanner.nextLine();
//        System.out.println(userInput);

        System.out.println("Enter a number:");
        int userNumber = scanner.nextInt();
        System.out.printf("You entered %d%n", userNumber);
        System.out.println("Do you want to enter another number?");
    }
}

