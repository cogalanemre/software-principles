package WithoutLSP;

public class DiscountCalculator {
    public double calculateDiscount(ICustomer customer, double purchaseAmount) {
        return customer.calculateDiscount(purchaseAmount);
    }
}
