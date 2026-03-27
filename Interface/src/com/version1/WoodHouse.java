package com.version1;

public class WoodHouse extends ConcreteHouse {
    @Override
    public void basement() {
        System.out.println("WoodHouse: Building a simple foundation/crawl space.");
    }

    @Override
    public void pillars() {
        System.out.println("WoodHouse: Using strong, treated wooden logs for pillars.");
    }

    @Override
    public void walls() {
        System.out.println("WoodHouse: Constructing walls from timber planks.");
    }

    @Override
    public void windows() {
        System.out.println("WoodHouse: Installing small, traditional wooden-framed windows.");
    }
}