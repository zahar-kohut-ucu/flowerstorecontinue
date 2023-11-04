package com.example.lab7.flower;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Flower extends Item {
    private final int defaultSepal = 69;
    private final double defaultPrice = 4.2;
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    public Flower() {
        sepalLength = defaultSepal;
        color = FlowerColor.RED;
        price = defaultPrice;
        flowerType = FlowerType.ROSE;
    }

    public Flower(
    double sepalLength,
    FlowerColor color,
    double price,
    FlowerType flowerType)
    {
        this.sepalLength = sepalLength;
        this.color = color;
        this.price = price;
        this.flowerType = flowerType;
    }

    public Flower(Flower flower) {
        this.sepalLength = flower.sepalLength;
        this.color = flower.color;
        this.price = flower.price;
        this.flowerType = flower.flowerType;
    }

    public String getColor() {
        return color.toString();
    }
}
