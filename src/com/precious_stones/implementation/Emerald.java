package com.precious_stones.implementation;

import com.precious_stones.PreciousStone;

public class Emerald extends PreciousStone {

    public Emerald(int transparency, double price, double weight) {
        super(transparency, price, weight);
    }

    @Override
    public double getValue() {
        return price * 0.75 * (transparency/100.0);
    }
}
