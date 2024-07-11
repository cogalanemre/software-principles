package WithoutOCP;

class SpecialCustomer implements ICustomer {
    @Override
    public double calculateDiscount(double purchaseAmount) {
        return purchaseAmount;
    }
}
