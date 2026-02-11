import java.util.Scanner;
public class shoppingcartprogram {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String item;
        double price;
        char currency = '$';
        int quantity;
        double totalPrice;

        System.out.print("What item would you like to buy: ");
        item = sc.nextLine();

        System.out.print("How many items are you buying? ");
        quantity = sc.nextInt();

        System.out.print("Enter the price of each item: ");
        price = sc.nextDouble();

        totalPrice =  price * quantity;
        double tax = totalPrice * (8.875/100);
        double totalPriceWTax = totalPrice + tax;

        System.out.println("The item: " + item);
        System.out.println("The number of items: " + quantity);
        System.out.println("Total price " + currency + totalPriceWTax);

        sc.close();
    }
}
