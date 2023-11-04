package com.example.lab7.flower;
import lombok.Getter;

public class FlowerPack {
    private Flower flower;
    @Getter
    private int quantity;

    public FlowerPack(Flower flower) {
        this.flower = new Flower(flower);
        this.quantity = 1;
    }

    public FlowerPack(Flower flower, int quantity) {
        this.flower = new Flower(flower);
        this.quantity = quantity;
    }

    public double getPrice() {
        return flower.getPrice() * quantity;
    }

    public void setQuantity(int quantityToSet) {
        if (quantityToSet < 0) {
            quantity = 0;
        } else {
            quantity = quantityToSet;
        }
    }
}
