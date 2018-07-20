package com.epam.homework.first.entity;

//универмаг
public class c2DepartmentStore extends b2PhysicalMarketPlace {
    private int tradingPlaceNumber;
    private int floorsNumber;

    public int getTradingPlaceNumber() {
        return tradingPlaceNumber;
    }

    public void setTradingPlaceNumber(int tradingPlaceNumber) {
        this.tradingPlaceNumber = tradingPlaceNumber;
    }

    public int getFloorsNumber() {
        return floorsNumber;
    }

    public void setFloorsNumber(int floorsNumber) {
        this.floorsNumber = floorsNumber;
    }
}
