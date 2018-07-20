package com.epam.homework.first.entity;

public class c1Forum extends b1ElectronicMarketPlace {
    private int activeUserCounter;
    private double commission;

    public int getActiveUserCounter() {
        return activeUserCounter;
    }

    public void setActiveUserCounter(int activeUserCounter) {
        this.activeUserCounter = activeUserCounter;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
}