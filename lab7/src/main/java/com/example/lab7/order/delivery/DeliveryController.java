package com.example.lab7.order.delivery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payment/delivery")
public class DeliveryController {

    @GetMapping("/")
    public String getDelivery() {
        return "Delivering your  order.....";
    }
}
