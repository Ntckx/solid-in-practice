package org.example.solid.ocp;

import org.example.domain.Item;

public class LaptopDiscount implements DiscountStrategy{
    @Override
    public boolean isApplicable(Item item){
        return item.getItemName().equals("Laptop");
    }

    @Override
    public double applyDiscount(Item item){
        return item.getPrice() * 0.9;
    }
}


