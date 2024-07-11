package WithOCP;

class RegularCustomer implements ICustomer {
    @Override
    public double calculateDiscount(double purchaseAmount) {
        return purchaseAmount * 0.1;
    }
}
