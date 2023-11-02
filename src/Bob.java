import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String userInput = "";
//
//        while (!userInput.equalsIgnoreCase("quit")) {
//            System.out.print("User: ");
//            userInput = input.nextLine();
//
//            if (userInput.trim().isEmpty()) {
//                System.out.println("Bob: Fine. Be that way!");
//            } else if (userInput.endsWith("?")) {
//                System.out.println("Bob: Sure.");
//            } else if (userInput.toUpperCase().equals(userInput)) {
//                System.out.println("Bob: Whoa, chill out!");
//            } else {
//                System.out.println("Bob: Whatever.");
//            }
//        }
        //get a few lines of input from user
        for (int i = 0; i < 5; i++) {
            //1.get a line of input from user
            System.out.print("say something to Bob: ");
            String line = input.nextLine();
            line = line.trim();
            if (line.endsWith("?")) {
                //2.if line ends with ? then do the ? output
                System.out.println("Sure.");
            } else if (line.endsWith("!")) {
                //3.if line ends with !then do the !output
                System.out.println("Whoa, chill out!");
            }else if (line.length()==0) {
                //4. if the line empty then do the empty output
                System.out.println("Fine. Be that way!");
            } else {
                //5.else whatever
                System.out.println("Whatever.");
            }
        }

        input.close();
    }
}
