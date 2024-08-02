package Rules.ReturnTypes;

import Rules.ICustomer;

public class BannedCustomer implements ICustomer {

//    //LSP'ye uygun
    @Override
    public Number calculateDiscount(Number purchaseAmount) {
        return 1;
    }

//    //LSP'ye uygun
//    @Override
//    public Integer calculateDiscount(Number purchaseAmount) {
//        return 1;
//    }

//    //LSP'ye uygun değil
//    @Override
//    public Object calculateDiscount(Number purchaseAmount) {
//        return 1;
//    }
}
