package com.example.lab7.decorators;

import com.example.lab7.flower.Item;

public class BasketDecorator extends ItemDecorator {
Item item;
    @Override
    public double getPrice() {
        return 4 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return description;
    }
}
