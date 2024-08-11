package Rules._4_ClassInvariants;

import Rules._3_Exceptions.ICustomer;

public class BannedCustomer extends Customer {

    //LSP'ye uygun değil
//    @Override
//    public Double calculateDiscount(Double purchaseAmount) {
//        var discount = purchaseAmount * 0.1;
//
//        discountLimit -= discount;
//
//        return discount;
//    }

    //LSP'ye uygun
    @Override
    public Double calculateDiscount(Double purchaseAmount) {
        var discount = purchaseAmount * 0.1;

        return discount;
    }
}
