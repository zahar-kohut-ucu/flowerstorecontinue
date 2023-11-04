package com.example.lab7.order.delivery;

import java.util.List;

import com.example.lab7.flower.Item;

public class DHLStrategy implements DeliveryStrategy {
    @Override
    public void delivery(List<Item> items) {
        System.out.print("Items: "
                         + items.toString()
                         + "were delivered via DHL Service.");
    }
}
