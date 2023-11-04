package com.example.lab7.flower;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

public class FlowerBucket extends Item {
    @Getter
    private List<FlowerPack> flowerPacks = new ArrayList<>();

    public void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        double price = 0;
        for (FlowerPack flowePack: flowerPacks) {
            price += flowePack.getPrice();
        }
        return price;
    }
}
