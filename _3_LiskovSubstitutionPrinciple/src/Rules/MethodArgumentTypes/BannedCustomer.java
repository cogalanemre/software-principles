package Rules.MethodArgumentTypes;

import Rules.ICustomer;

public class BannedCustomer implements ICustomer {
//    @Override
//    public double calculateDiscount(int purchaseAmount) throws UnsupportedOperationException {
//        throw new UnsupportedOperationException("No discount for banned customers");
//    }

//    @Override
//    public double calculateDiscount(object purchaseAmount) throws UnsupportedOperationException {
//        throw new UnsupportedOperationException("No discount for banned customers");
//    }

    @Override
    public double calculateDiscount(double purchaseAmount) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("No discount for banned customers");
    }
}
