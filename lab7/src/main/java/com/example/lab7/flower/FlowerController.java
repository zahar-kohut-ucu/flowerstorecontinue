package com.example.lab7.flower;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flower")
public class FlowerController {
    private static final double sepal = 69;
    private static final double price = 420;
    @GetMapping("/")
    public Flower getFlower() {
        return new Flower(sepal, FlowerColor.GREEN, price, FlowerType.CHAMOMILE);
    }
}