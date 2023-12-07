import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15){
//            System.out.println(i);
//            i++;
//        }

//        int i = 0;
//        do {
//            System.out.println(i);
//            i+=2;
//        } while (i <= 100);

//        int i = 100;
//        do {
//            System.out.println(i);
//            i-=5;
//        } while (i >= -10);

//        long i = 2;
//        do {
//            System.out.println(i);
//            i*=i;
//        } while (i <= 1000000);

//        for (int i = 0; i <= 100; i++){
//            if (i % 3 == 0 && i % 5 == 0){
//                System.out.println("Fizz Buzz");
//            } else if (i % 3 == 0){
//                System.out.println("Fizz");
//            } else if (i % 5 == 0){
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        String userChoice;
        Scanner scanner = new Scanner(System.in);
//        do {
//            System.out.println("Enter an integer:");
//            int userInteger = Integer.parseInt(scanner.nextLine());
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for (int i = 1; i <= userInteger; i++){
//                System.out.printf("%-7d| %-8d| %d %n", i, i*i, i*i*i);
//            }
//            System.out.println("Do you want to continue?");
//            userChoice = scanner.nextLine().toLowerCase();
//        } while(userChoice.equals("y") || userChoice.equals("yes"));


        String userChoice;
        do {
            System.out.println("Enter a numeric grade between 0 and 100:");
            int grade = Integer.parseInt(scanner.nextLine());
            char letterGrade = 'F';
            if (grade > 60 && grade < 70 ) {
                letterGrade = 'D';
            } else if (grade < 80) {
                letterGrade = 'C';
            } else if (grade < 90){
                letterGrade = 'B';
            } else if (grade < 100){
                letterGrade = 'A';
            }
            System.out.printf("The letter grade is %c%n", letterGrade);
            System.out.println("Do you want to continue?");
            userChoice = scanner.nextLine().toLowerCase();
        } while (userChoice.equals("yes") || userChoice.equals("y"));
    }
}
