package Day_7;

import java.util.*;
public class Program8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a value:");
            int a = scanner.nextInt();

            System.out.print("Enter b value:");
            int b = scanner.nextInt();

            int result = a / b;
            System.out.println("Result of a/b: " + result);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("Please enter valid integer values");

        } finally {
            scanner.close();
        }
    }
}
