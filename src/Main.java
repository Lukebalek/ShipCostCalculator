import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the item price
        System.out.print("Enter the price of the item: $");
        double itemPrice = scanner.nextDouble();

        // Calculate shipping cost
        double shippingCost;
        if (itemPrice >= 100.0) {
            shippingCost = 0.0; // Free shipping for items $100 or more
        } else {
            shippingCost = 0.02 * itemPrice; // 2% shipping cost for items less than $100
        }

        // Calculate total price
        double totalPrice = itemPrice + shippingCost;

        // Display shipping cost and total price
        System.out.printf("Shipping Cost: $%.2f%n", shippingCost);
        System.out.printf("Total Price: $%.2f%n", totalPrice);

        scanner.close();
    }
}
