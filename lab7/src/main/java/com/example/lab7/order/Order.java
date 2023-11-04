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

    public double totalPrice() {
        double total = 0;
        for (Item elem : items) {
            total = total + elem.getPrice();
        }
        return total;
    }

    public void setPaymentStrategy(PaymentType ppayment) {
        this.payment = ppayment;
    }

    public void setDeliveryStrategy(DeliveryType ddelivery) {
        this.delivery = ddelivery;
    }

    public void processOrder() {
        Payment paym = new Payment(null);
        if (payment == PaymentType.CARD) {
            paym.setStrat(new CardStrategy());
        }
        if (payment == PaymentType.PAYPAL) {
            paym.setStrat(new PayPalStrategy());
        }

        Delivery deliv = new Delivery(null);
        if (delivery == DeliveryType.POST) {
            deliv.setStrat(new PostStrategy());
        }
        if (delivery == DeliveryType.DHL) {
            deliv.setStrat(new DHLStrategy());
        }

        if (paym.pay(totalPrice())) {
            System.out.println("payment success");
            deliv.delivery(items);
            System.out.println("order success");
        } else {
            System.out.println("no success");
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
