package com.example.lab7.order.delivery;

import java.util.List;

import com.example.lab7.flower.Item;

public interface DeliveryStrategy {
    void delivery(List<Item> items);
}
