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

        //The multiple input datatypes problem
        //Scanner will get you
        // If you take in an integer, for example
        System.out.println("Enter a number:");
        int userNumber = Integer.parseInt(scanner.nextLine());
        System.out.printf("You entered %s%n", userNumber);

        //And after an integer, you take in a string
        System.out.println("Do you want to enter another number?");
        String ghostString = scanner.nextLine();
        String userResponse = scanner.nextLine();
        System.out.printf("You said %s",userResponse);

        System.out.println("Enter a random sentence:");
        String userSentence = scanner.nextLine();
        System.out.printf("Your sentence is: %s", userSentence);
    }
}

