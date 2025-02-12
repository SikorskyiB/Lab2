package com.precious_stones.implementation;

import com.precious_stones.PreciousStone;

public class Ruby extends PreciousStone {

    public Ruby(int transparency, double price, double weight) {
        super(transparency, price, weight);
    }

    @Override
    public double getValue() {
        return price * 3 * (transparency/100.0);
    }
}
