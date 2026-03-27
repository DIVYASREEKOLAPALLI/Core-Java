package com.version1;

public class GlassHouse extends ConcreteHouse {
    @Override
    public void basement() {
        System.out.println("GlassHouse: Constructing basement with reinforced concrete for stability.");
    }

    @Override
    public void pillars() {
        System.out.println("GlassHouse: Installing slim steel pillars for a modern look.");
    }

    @Override
    public void walls() {
        System.out.println("GlassHouse: Erecting walls primarily made of tempered glass panels.");
    }

    @Override
    public void windows() {
        System.out.println("GlassHouse: Installing large, floor-to-ceiling windows.");
    }
}