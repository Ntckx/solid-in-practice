package org.example.solid.srp;

import org.example.domain.Order;

public class OrderProcessor {
    // NOTE: We have achieved SRP by extracting the calculation logic.
    private final PriceCalculator priceCalculator;
    private final OrderRepository orderRepository;
    private final Notifier notifier;

    public OrderProcessor(PriceCalculator priceCalculator, OrderRepository orderRepository, Notifier notifier) {
        this.priceCalculator = priceCalculator;
        this.orderRepository = orderRepository;
        this.notifier = notifier;
    }

    public void process(Order order) {
        // This now does not handle multiple logic but relies on logic from TotalPriceCalculator... This follows SRP
        double totalPrice = priceCalculator.calculate(order.getItems());
        orderRepository.saveOrder(order.getId(),totalPrice);
        notifier.notifyCustomer(order.getCustomerEmail(), "Order is placed successfully");
    }
}
