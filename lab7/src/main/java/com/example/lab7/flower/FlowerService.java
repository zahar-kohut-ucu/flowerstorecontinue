package com.example.lab7.flower;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FlowerService {
    public List<Flower> getFlowers() {
        return List.of(new Flower(69, FlowerColor.GREEN, 420, FlowerType.CHAMOMILE));
    }
}