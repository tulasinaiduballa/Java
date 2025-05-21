package Day_7;

import java.util.*;

public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a value:");
            int a = scanner.nextInt();

            System.out.print("Enter b value:");
            int b = scanner.nextInt();

            int c = a / b;
            System.out.println(c);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("enter valid integer values");

        } finally {
            scanner.close(); 
        }
    }
}
