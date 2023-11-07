package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("Enter a string:");
        String string = input.getString();
        System.out.println("You entered: " + string);

        System.out.println("Enter yes or no:");
        boolean yesNo = input.yesNo();
        System.out.println("You entered: " + yesNo);

        System.out.println("Enter an integer between 1 and 10:");
        int intValue = input.getInt(1, 10);
        System.out.println("You entered: " + intValue);

        System.out.println("Enter an integer:");
        int intValueNoRange = input.getInt();
        System.out.println("You entered: " + intValueNoRange);

        System.out.println("Enter a double between 1.0 and 10.0:");
        double doubleValue = input.getDouble(1.0, 10.0);
        System.out.println("You entered: " + doubleValue);

        System.out.println("Enter a double:");
        double doubleValueNoRange = input.getDouble();
        System.out.println("You entered: " + doubleValueNoRange);
    }
}
