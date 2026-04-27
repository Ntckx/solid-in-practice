package org.example.solid.ocp;

import org.example.domain.Item;

public class TabletDiscount implements DiscountStrategy{
    @Override
    public boolean isApplicable(Item item){
        return item.getItemName().equals("Tablet");
    }

    @Override
    public double applyDiscount(Item item){
        return item.getPrice() * 0.5;
    }
}



