package com.example.lab7.order;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import com.example.lab7.flower.Item;
import com.example.lab7.order.delivery.DHLStrategy;
import com.example.lab7.order.delivery.Delivery;
import com.example.lab7.order.delivery.DeliveryType;
import com.example.lab7.order.delivery.PostStrategy;
import com.example.lab7.order.payment.CardStrategy;
import com.example.lab7.order.payment.PayPalStrategy;
import com.example.lab7.order.payment.PaymentType;
import com.example.lab7.order.payment.Payment;

@Getter
public class Order {
    private List<Item> items = new ArrayList<>();
    private PaymentType payment;
    private DeliveryType delivery;

    public void setPaymentStrategy(PaymentType paym) {
        this.payment = paym;
    }

    public void setDeliveryStrategy(DeliveryType deliv) {
        this.delivery = deliv;
    }

    public double calculateTotalPrice() {
        double result = 0;
        for (Item elem : items) {
            result += elem.getPrice();
        }
        return result;
    }

    public void processOrder() {
        Payment paym = new Payment(null);
        if (payment == PaymentType.CARD) {
            paym.setStrategy(new CardStrategy());
        }
        if (payment == PaymentType.PAYPAL) {
            paym.setStrategy(new PayPalStrategy());
        }

        Delivery del = new Delivery(null);
        if (delivery == DeliveryType.POST) {
            del.setStrategy(new PostStrategy());
        }
        if (delivery == DeliveryType.DHL) {
            del.setStrategy(new DHLStrategy());
        }

        if (paym.pay(calculateTotalPrice())) {
            System.out.println("Payment is successful!");
            del.delivery(items);
            System.out.println("Order proccessed!");
        } else {
            System.out.println("Payment is unsuccessful! Try again.");
        }

    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeltem(Item item) {
        if (items.contains(item)) {
            items.remove(item);
        }
    }
}
