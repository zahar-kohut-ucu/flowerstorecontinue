package com.example.lab7.order.delivery;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import com.example.lab7.flower.Item;

@Setter
@Getter
@AllArgsConstructor
public class Delivery {
    private DeliveryStrategy strat;

    public void delivery(List<Item> items) {
        strat.delivery(items);
    }
}