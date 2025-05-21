package Day_7;

public class Program1 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        if (args.length < 1) {
            System.out.println("Enter index value:");
            return;
        }

        try {
            int index = Integer.parseInt(args[0]);
            System.out.println("Index value is: " + index);

            System.out.println("The element at " + index + " is " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The mentioned index is out of bounds.");
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer index.");
        }
    }
}
