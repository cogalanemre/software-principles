package Rules._4_ClassInvariants;

 public class Customer {

     Double discountLimit;

     public Double calculateDiscount(Double purchaseAmount) {
         var discount = purchaseAmount * 0.1;

         if (discount <= discountLimit)
             discountLimit -= discount;
         else
             throw new UnsupportedOperationException("The discount limit has been reached");

         return discount;
     }
 }
