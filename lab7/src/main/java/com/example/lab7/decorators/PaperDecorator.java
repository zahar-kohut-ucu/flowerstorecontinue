package com.example.lab7.decorators;

import com.example.lab7.flower.Item;

public class PaperDecorator extends ItemDecorator {
    Item item;
    @Override
    public double getPrice() {
        return 13 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return description;
    }
}
