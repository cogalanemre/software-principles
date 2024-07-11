package WithOCP;

public class Main {
    public static void main(String[] args) {
        RegularCustomer customer = new RegularCustomer();
        DiscountCalculator calculator = new DiscountCalculator();
        double discount = calculator.calculateDiscount(customer, 100.0);
        System.out.println("Discount: " + discount);
    }
}

