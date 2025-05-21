package Day_7;

class BulkStockException extends Exception {
    public BulkStockException(String productName) {
        super("The " + productName + " cannot be ordered in quantities of more than 10 units.");
    }
}

class ShoppingCart {
    public void addToCart(String productName, int quantity) throws BulkStockException {
        if (quantity > 10) {
            throw new BulkStockException(productName);
        } else {
            System.out.println(quantity + " units of " + productName + " added to the cart.");
        }
    }
}

public class Program7 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Enter product name and their quantity:");
            return;
        }

        String productName = args[0];
        int quantity = 0;

        try {
            quantity = Integer.parseInt(args[1]);

            ShoppingCart cart = new ShoppingCart();

            cart.addToCart(productName, quantity);

        } catch (BulkStockException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Quantity must be a valid integer");
        }
    }
}
