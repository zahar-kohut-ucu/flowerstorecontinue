package com.example.lab7.flower;

public enum FlowerColor {
    RED("#FF0000"),
    BLUE("#0000FF"),
    GREEN("#00FF00");
    private String color;

    FlowerColor(String color) {
        this.color = color;
    }

    public String toString() {
        return this.color;
    }
}
