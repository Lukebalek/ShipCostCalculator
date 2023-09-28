import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of the item: $");
        double itemPrice = scanner.nextDouble();

        double shippingCost;
        if (itemPrice >= 100.0) {
            shippingCost = 0.0;
        } else {
            shippingCost = 0.02 * itemPrice;
        }

        double totalPrice = itemPrice + shippingCost;

        System.out.println("Your total cost is " + totalPrice);
        System.out.println("Your total cost is " + totalPrice);

        scanner.close();
    }
}
