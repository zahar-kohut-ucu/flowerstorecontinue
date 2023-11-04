package com.example.lab7.order.payment;

public class CardStrategy implements PaymentStrategy {
    private static final double CARD_BALANCE = 1000;
    @Override
    public boolean pay(double price) {
        return price <= CARD_BALANCE;
    }
}
