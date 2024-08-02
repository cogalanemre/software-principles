package Rules.MethodArgumentTypes;

import Rules.ICustomer;

public class BannedCustomer implements ICustomer {
//    @Override
//    public Number calculateDiscount(int purchaseAmount) throws UnsupportedOperationException {
//        throw new UnsupportedOperationException("No discount for banned customers");
//    }

//    @Override
//    public Number calculateDiscount(object purchaseAmount) throws UnsupportedOperationException {
//        throw new UnsupportedOperationException("No discount for banned customers");
//    }

    @Override
    public Number calculateDiscount(double purchaseAmount) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("No discount for banned customers");
    }
}
