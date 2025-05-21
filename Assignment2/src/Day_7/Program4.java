package Day_7;

import java.util.*;

public class Program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer as a string:");
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("The input is not a valid integer.");
        } finally {
            scanner.close();
        }
    }
}
