package org.example.solid.lsp;

public class CreditCardPayment implements Payment, Refundable {
    @Override
    public void pay(double amount){
        System.out.println("Card paid");
    }

    @Override
    public void refund(double amount){
        System.out.println("Refunded to your credit card");
    }
}


