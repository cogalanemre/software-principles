package Rules.ReturnTypes;

import Rules.ICustomer;

public class BannedCustomer implements ICustomer {

//    @Override
//    public Object calculateDiscount(double purchaseAmount) throws UnsupportedOperationException {
//        throw new UnsupportedOperationException("No discount for banned customers");
//    }

    @Override
    public Double calculateDiscount(Number purchaseAmount) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("No discount for banned customers");
    }
}
