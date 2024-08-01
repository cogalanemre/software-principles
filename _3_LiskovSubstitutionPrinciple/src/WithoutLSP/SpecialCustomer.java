package WithoutLSP;

class SpecialCustomer implements ICustomer {
    @Override
    public double calculateDiscount(double purchaseAmount) {
        return purchaseAmount * 0.5;
    }
}
