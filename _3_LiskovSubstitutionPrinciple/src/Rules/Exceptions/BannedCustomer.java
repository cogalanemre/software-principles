package Rules.Exceptions;

import Rules.ICustomer;

public class BannedCustomer implements ICustomer {

    //LSP'ye uygun
//    @Override
//    public Number calculateDiscount(Number purchaseAmount) {
//        return 1;
//    }

//    //LSP'ye uygun
//    @Override
//    public Number calculateDiscount(Number purchaseAmount) throws RuntimeException{
//        throw new RuntimeException();
//    }

    //LSP'ye uygun
    @Override
    public Number calculateDiscount(Number purchaseAmount) throws UnsupportedOperationException{
        throw new UnsupportedOperationException();
    }

//    //LSP'ye uygun değil
//    @Override
//    public Number calculateDiscount(Number purchaseAmount) throws Exception{
//        throw new Exception();
//    }
}
