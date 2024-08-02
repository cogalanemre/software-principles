package Rules.MethodArgumentTypes;

import Rules.ICustomer;

public class BannedCustomer implements ICustomer {

//    //LSP'ye uygun fakat Java'ya uygun değil
//    @Override
//    public Number calculateDiscount(Integer purchaseAmount) {
//        return 1;
//    }

//    //LSP'ye uygun değil
//    @Override
//    public Number calculateDiscount(Object purchaseAmount) {
//        return 1;
//    }

    //LSP'ye ve Java'ya uygun
    @Override
    public Number calculateDiscount(Number purchaseAmount) {
        return 1;
    }
}
