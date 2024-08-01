package WithoutLSP;

public class Main {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        var customer = new BannedCustomer();
        double discount = calculator.calculateDiscount(customer, 100.0);
        System.out.println("Discount: " + discount);
    }
}