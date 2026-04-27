package org.example.solid.srp;

import org.example.domain.Item;
import org.example.solid.ocp.DiscountStrategy;

import java.util.List;

//Create a class that handles on calculating price logic
public class TotalPriceCalculator implements PriceCalculator {

    //SRP
//    @Override
//    public double calculate(List<Item> itemList){
//        double totalPrice = 0;
//
//        for(Item item: itemList){
//            if(item.getItemName().equals("Laptop")){
//                totalPrice = totalPrice + item.getPrice() * 0.9;
//            }
//            else{
//                totalPrice = totalPrice + item.getPrice();
//            }
//        }
//        return totalPrice;
//    }

    //    OCP
//What if new item Tablet have discount for the special event later like Holiday Sales
// The Bad way would be extending if else stmt...
//    @Override
//    public double calculate(List<Item> itemList) {
//        double totalPrice = 0;
//
//        for (Item item : itemList) {
//            if (item.getItemName().equals("Laptop")) {
//                totalPrice = totalPrice + item.getPrice() * 0.9;
//            } else if (item.getItemName().equals("Tablet")) {
//                totalPrice = totalPrice + item.getPrice() * 0.5;
//            } else {
//                totalPrice = totalPrice + item.getPrice();
//            }
//        }
//        return totalPrice;
//    }


    // We can define that Laptop and Tablet have a same goal, which is discount
    // ... So we create interface called discount which handles discounting item
    private final List<DiscountStrategy> discountStrategy;

    public TotalPriceCalculator(List<DiscountStrategy> discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    @Override
    public double calculate(List<Item> itemList) {
        double totalPrice = 0;

        for (Item item : itemList) {
            totalPrice = totalPrice + discountStrategy.stream()
                    .filter(s -> s.isApplicable(item))
                    .findFirst()
                    .map(s -> s.applyDiscount(item))
                    .orElse(item.getPrice());
        }
        return totalPrice;
    }
}


