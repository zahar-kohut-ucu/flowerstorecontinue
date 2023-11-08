package com.example.lab7.decorators;

import com.example.lab7.flower.Item;

public class RibbonDecorator extends ItemDecorator {
    Item item;
    @Override
    public double getPrice() {
        return 40 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return description;
    }
}
