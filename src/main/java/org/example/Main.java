package org.example;


import org.example.solid.lsp.CreditCardPayment;
import org.example.solid.lsp.Payment;
import org.example.solid.lsp.Refundable;
import org.example.solid.lsp.VoucherPayment;

import java.util.List;

// Simple Online Shopping System
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        // OCP
//        // If laptop has discount
//        DiscountStrategy laptopSpecialist = new LaptopDiscount();
//        List<DiscountStrategy> strategyTeam = List.of(laptopSpecialist);
//        PriceCalculator calculator = new TotalPriceCalculator(strategyTeam);
//
//        // Create the Domain Entities (Using the Seductive Builder Pattern)
//        Item myItem = Item.builder()
//                .id(UUID.randomUUID())
//                .itemName("Laptop")
//                .price(1000.0)
//                .build();
//
//        // Execute the Process
//        // We put our item into a 'cart' (List) so the calculator can process it.
//        List<Item> cart = List.of(myItem);
//        double finalPrice = calculator.calculate(cart);
//
//        System.out.println("--- Architectural Result ---");
//        System.out.println("Item: " + myItem.getItemName());
//        System.out.println("Original Price: $" + myItem.getPrice());
//        System.out.println("Strategic Total: $" + finalPrice);


//        List<PaymentMethod> paymentMethod = List.of(
//                new CreditCardPayment(),
//                new VoucherPayment()
//        );
//        System.out.println("Attempting to refund all items");
//
//        for (PaymentMethod paymentMethod1: paymentMethod  ) {
////            Though it looks clean, but it will cause error
////            as the child Voucher Payment class did not return what is promise by their parent Payment Method
//            paymentMethod1.refund(50.0);
//        }

        CreditCardPayment creditCard = new CreditCardPayment();
        VoucherPayment voucher = new VoucherPayment();

        List<Payment> paymentList = List.of(creditCard, voucher);
        System.out.println("Processing Payments");
        for (Payment p : paymentList) {
            p.pay(100.0);
        }

        List<Refundable> refundableList = List.of(creditCard);

        System.out.println("Refunding");
        for (Refundable r : refundableList) {
//            With this setting the voucher is not added to refundable list
            r.refund(50.0);
        }


    }
}