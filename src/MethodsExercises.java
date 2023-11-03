import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + subtract(a, b));
        System.out.println("Multiplication: " + multiply(a, b));
        System.out.println("Division: " + divide(a, b));
        System.out.println("Modulus:" + modulus(a,b));
    }
    public static int add(int a, int b) {
        return a + b;
    }


    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
//        return a* b;
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }

    public static double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Dividing by zero is not allowed.");
            return 0;
        }
    }
    public static int modulus(int a, int b) {
        return a / b;
    }

}



