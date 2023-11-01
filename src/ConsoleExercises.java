import java.util.Scanner;

public class ConsoleExercises {
    public static void  main(String[] args){
//        double pi = 3.14159;
        //Question 1
//        System.out.format("The value of pi is approximately %.2f.", pi);

        //Question 2:1. I get an error code.
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an integer:");
//        int number = scanner.nextInt();
//        System.out.printf("You entered:" + number);
        //Question 2:2.I cannot finish code unless I put in the 3 words. Code will finish right after the 3rd word and will not input anything after.
//        System.out.println("Enter 3 words:");
//        String word1 = scanner.next();
//        String word2 = scanner.next();
//        String word3 = scanner.next();
//        System.out.println("Word 1: " + word1);
//        System.out.println("Word 2: " + word2);
//        System.out.println("Word 3: " + word3);
        //Question 2:3.I did not capture anything after the first space.
//        System.out.print("Enter a sentence: ");
//        String sentence = scanner.next();
//        System.out.println("You entered: " + sentence);
        //Question 2:4.This time it captured all the sentence.
//        System.out.print("Enter a sentence: ");
//        String sentence = scanner.nextLine();
//        System.out.println("You entered: " + sentence);

        //Question 3:1
        System.out.println("Enter the length of the classroom:");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the width of the classroom:");
        int width = Integer.parseInt(scanner.nextLine());

        //Question 3:2
        int area = length * width;
        int perimeter = 2 * (length + width);
        System.out.println("The area of the classroom is: " + area);
        System.out.println("The perimeter of the classroom is: " + perimeter);



    }
}
