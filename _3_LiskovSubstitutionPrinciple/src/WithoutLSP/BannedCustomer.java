package WithoutLSP;

public class BannedCustomer implements ICustomer{
    @Override
    public double calculateDiscount(double purchaseAmount) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("No discount for banned customers");
    }
}
