package WithoutOCP;

public class Main {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        double discount = calculator.calculateDiscount("Regular", 100.0);
        System.out.println("Discount: " + discount);
    }
}