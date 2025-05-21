package Day_7;

class InvalidEmployeeIdException extends Exception {
    public InvalidEmployeeIdException(String message) {
        super(message);
    }
}

public class Program2 {
    public static void main(String[] args) {
    	if (args.length < 1) {
            System.out.println("Enter the employee ID:");
            return;
        }

        try {
            int empId = Integer.parseInt(args[0]);
            System.out.println(empId);

            if (empId < 0 || empId > 999) {
                throw new InvalidEmployeeIdException("Invalid Employee ID");
            }

            System.out.println("Valid Employee ID");

        } catch (InvalidEmployeeIdException e) {
            System.out.println("Exception caught");
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number.");
        }
    }
}
