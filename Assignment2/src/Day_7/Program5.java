package Day_7;

public class Program5 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please enter a coupon code:");
            return;
        }

        String couponCode = args[0];

        try {
            if (!couponCode.equals("COUPON123")) {
                throw new Exception("Invalid Coupon Code");
            }

            System.out.println("Coupon code applied successfully");

        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Thank you for shopping with us!!");
        }
    }
}
