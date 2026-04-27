package org.example.solid.ocp;

import org.example.domain.Item;

public interface DiscountStrategy {
    boolean isApplicable(Item item);
    double applyDiscount(Item item);
}


