package com.example.lab7.order.payment;

public class PayPalStrategy implements PaymentStrategy {
    private static final double paypalBalance = 420;
    @Override
    public boolean pay(double price) {
        return price <= paypalBalance;
    }
}
