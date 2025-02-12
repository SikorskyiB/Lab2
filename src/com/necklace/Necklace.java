package com.necklace;

import com.precious_stones.PreciousStone;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Necklace {
    public List<PreciousStone> stones;

    public Necklace() {
        this.stones = new ArrayList<>();
    }

    public Necklace(List<PreciousStone> stones) {
        this.stones = stones;
    }

    public void addStone(PreciousStone stone) {
        stones.add(stone);
    }

    public double getWeight() {
        double sum = 0;
        for (PreciousStone stone: stones) {
            sum += stone.weight;
        }
        return sum;
    }

    public double getPrice() {
        double sum = 0;
        for (PreciousStone stone: stones) {
            sum += stone.price;
        }
        return sum;
    }

    public void sortByValue() {
        List<PreciousStone> sortedStones = new ArrayList<>(stones);
        sortedStones.sort(Comparator.comparingDouble(a -> a.getValue()));
        stones = sortedStones;
    }

    public List<PreciousStone> findInTransparencyRange(int min, int max) {
        List<PreciousStone> filteredStones = new ArrayList<>();
        for (PreciousStone stone: stones) {
            if (stone.transparency > min && stone.transparency < max) {
                filteredStones.add(stone);
            }
        }
        return filteredStones;
    }

    public void displayValues() {
        List<String> outputString = new ArrayList<>();
        for (PreciousStone stone: stones) {
            outputString.add(String.format("%s(%s)", stone.getName(), String.valueOf(Math.round(stone.getValue()*100)/100.0).replace(",", ".")));
        }
        System.out.println(outputString);
    }

    @Override
    public String toString() {
        return stones.toString();
    }
}
