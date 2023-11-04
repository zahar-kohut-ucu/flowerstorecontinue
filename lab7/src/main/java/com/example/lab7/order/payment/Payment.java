package com.example.lab7.order.payment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Payment {
    private PaymentStrategy strat;

    public boolean pay(double price) {
        return strat.pay(price);
    }
}
