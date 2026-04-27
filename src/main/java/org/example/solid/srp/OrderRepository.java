package org.example.solid.srp;

import java.util.UUID;

public interface OrderRepository {
    void saveOrder(UUID orderId, double totalPrice);
}
