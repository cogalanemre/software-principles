package WithoutOCP;

public class DiscountCalculator {
    public double calculateDiscount(String customerType, double purchaseAmount) {
        if (customerType.equals("Regular")) {
            return purchaseAmount * 0.1; // 10% discount for regular customers
        } else if (customerType.equals("Premium")) {
            return purchaseAmount * 0.2; // 20% discount for premium customers
        } else if (customerType.equals("Special")) {
            return purchaseAmount * 0.5;
        }
        return 0;
    }

    public double calculateDiscount(ICustomer customer, double purchaseAmount) {
        if (customer instanceof RegularCustomer) {
            return purchaseAmount * 0.1; // 10% discount for regular customers
        } else if (customer instanceof PremiumCustomer) {
            return purchaseAmount * 0.2; // 20% discount for premium customers
        } else if (customer instanceof SpecialCustomer) {
            return purchaseAmount * 0.5;
        }
        return 0;
    }
}
