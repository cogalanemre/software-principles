package WithOCP;

class PremiumCustomer implements ICustomer {
    @Override
    public double calculateDiscount(double purchaseAmount) {
        return purchaseAmount * 0.2;
    }
}
