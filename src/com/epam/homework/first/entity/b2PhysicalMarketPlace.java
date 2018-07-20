package com.epam.homework.first.entity;

public abstract class b2PhysicalMarketPlace extends aMarketPlace {
    private String address;
    private double area;
    private boolean security;
    private int passability; //проходимость

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean hasSecurity() {
        return security;
    }

    public void setSecurity(boolean security) {
        this.security = security;
    }

    public int getPassability() {
        return passability;
    }

    public void setPassability(int passability) {
        this.passability = passability;
    }
}
