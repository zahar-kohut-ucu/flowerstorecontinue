package com.example.lab7.flower;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
public class Flower extends Item {
    private String description;
    @Id
    private int id;
    private final int defaultSepal = 69;
    private final double defaultPrice = 4.2;
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    public Flower() {
        description = "Description of flower.";
        sepalLength = defaultSepal;
        color = FlowerColor.RED;
        price = defaultPrice;
        flowerType = FlowerType.ROSE;
    }

    public Flower(
    String description,
    double sepalLength,
    FlowerColor color,
    double price,
    FlowerType flowerType)
    {
        this.description = description;
        this.sepalLength = sepalLength;
        this.color = color;
        this.price = price;
        this.flowerType = flowerType;
    }

    public Flower(Flower flower) {
        this.description = flower.description;
        this.sepalLength = flower.sepalLength;
        this.color = flower.color;
        this.price = flower.price;
        this.flowerType = flower.flowerType;
    }

    public String getColor() {
        return color.toString();
    }
}
