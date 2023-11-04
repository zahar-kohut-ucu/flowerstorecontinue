package com.example.lab7.order.payment;

public class CardStrategy implements PaymentStrategy {
    private static final double cardBalance = 420;
    @Override
    public boolean pay(double price) {
        return price <= cardBalance;
    }
}
