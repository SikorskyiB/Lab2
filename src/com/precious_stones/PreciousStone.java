package com.precious_stones;

public  abstract class PreciousStone {

    public int transparency;
    public double price;
    public double weight;

    public PreciousStone(int transparency, double price, double weight) throws IllegalArgumentException {
        if (transparency < 0 || transparency > 100) {
            throw new IllegalArgumentException();
        }
        this.transparency = transparency;
        this.price = price;
        this.weight = weight;
    }

    public abstract double getValue();

    public String getName(){
        String name = this.getClass().getName();
        return name.substring(name.lastIndexOf('.') + 1);
    }

    @Override
    public String toString() {
        return  String.format("%s(%s%% %.2f$ %.2fCD)", this.getName(), this.transparency, this.price, this.weight);
    }
}
