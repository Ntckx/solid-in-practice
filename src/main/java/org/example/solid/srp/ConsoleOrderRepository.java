package org.example.solid.srp;

import java.util.UUID;

public class ConsoleOrderRepository implements OrderRepository {
    @Override
    public void saveOrder(UUID orderId, double totalPrice) {
        System.out.println("Connecting to PostGres...");
        System.out.println("Saving order: " + orderId + " With total: " + totalPrice);
    }
}
