package com.example.lab7;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.lab7.flower.Flower;
import com.example.lab7.flower.FlowerBucket;
import com.example.lab7.flower.FlowerColor;
import com.example.lab7.flower.FlowerPack;
import com.example.lab7.flower.FlowerType;
import com.example.lab7.order.Order;
import com.example.lab7.order.delivery.DeliveryType;
import com.example.lab7.order.payment.PaymentType;

public class PostStrategyTest {
    private static final double sepal = 10;
    private static final double price = 15;
    private static final int ITER = 3;
    private Order ord = new Order();
    private Flower fl = new Flower(
        price, FlowerColor.BLUE, price, FlowerType.TULIP);
    private FlowerPack flPack = new FlowerPack(fl);
    private FlowerBucket bucket = new FlowerBucket();

    @BeforeEach
    public void init() {
        for (int i = 0; i < ITER; i++) {
            bucket.addFlowerPack(flPack);
        }

        ord.addItem(bucket);
        ord.setPaymentStrategy(PaymentType.CARD);
        ord.setDeliveryStrategy(DeliveryType.DHL);
    }

    @Test
    public void processOrder() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        ord.processOrder();
        String printedText = outputStream.toString();

        System.setOut(System.out);
        printedText.contains("Order proccessed!");
    }
}
