package com.precious_stones.implementation;

import com.precious_stones.PreciousStone;


public class Diamond extends PreciousStone {

    public Diamond(int transparency, double price, double weight) {
        super(transparency, price, weight);
    }

    @Override
    public double getValue() {
        return price * 1 * (transparency/100.0);
    }
}

