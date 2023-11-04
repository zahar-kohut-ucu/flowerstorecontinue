package com.example.lab7.order.delivery;

import java.util.List;

import com.example.lab7.flower.Item;

public class PostStrategy implements DeliveryStrategy {
    @Override
    public void delivery(List<Item> items) {
        System.out.print("Delivery of items: "
                         + items
                         + "via Post Service was succesfull.");
    }
}
