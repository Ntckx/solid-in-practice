package org.example.solid.lsp;

// As Liskov Principal, if S (VoucherPayment) is a subtype of T (PaymentMethod),
// then T can be replaced with objects of type S without changing any of program properties
public class VoucherPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Applying voucher: -" + amount);
    }
}


