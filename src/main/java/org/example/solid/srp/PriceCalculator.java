package org.example.solid.srp;

import org.example.domain.Item;

import java.util.List;

public interface PriceCalculator {
    double calculate(List<Item> items);
}
