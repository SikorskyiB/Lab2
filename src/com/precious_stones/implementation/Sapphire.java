package com.precious_stones.implementation;

import com.precious_stones.PreciousStone;

public class Sapphire extends PreciousStone {
    public Sapphire(int transparency, double price, double weight) {
        super(transparency, price, weight);
    }

    @Override
    public double getValue()
    {
        return price * 1.2 * (transparency/100.0);
    }
}
