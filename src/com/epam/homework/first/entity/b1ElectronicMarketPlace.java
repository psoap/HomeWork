package com.epam.homework.first.entity;

public abstract class b1ElectronicMarketPlace extends aMarketPlace{
    private String domain;
    private int visitorCounter;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public int getVisitorCounter() {
        return visitorCounter;
    }

    public void setVisitorCounter(int userCounter) {
        this.visitorCounter = userCounter;
    }
}