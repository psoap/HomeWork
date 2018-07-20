package com.epam.homework.first.entity;

public class c2Boutique extends b2PhysicalMarketPlace {
    private double height;
    private boolean shutters; //ставни

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean hasShutters() {
        return shutters;
    }

    public void setShutters(boolean shutters) {
        this.shutters = shutters;
    }       
}