package com.epam.homework.first.entity;

import com.epam.homework.first.enums.PaymentSystem;
import java.util.HashSet;
import java.util.Set;

public class c1OnlineShop extends b1ElectronicMarketPlace {
    private int goodsCounter;
    private Set<PaymentSystem> acceptedPaymetSystems = new HashSet<>();

    public int getGoodsCounter() {
        return goodsCounter;
    }

    public void setGoodsCounter(int goodsCounter) {
        this.goodsCounter = goodsCounter;
    }

    public Set<PaymentSystem> getAcceptedPaymetSystems() {
        return acceptedPaymetSystems;
    }

    public void setAcceptedPaymetSystems(Set<PaymentSystem> acceptedPaymetSystems) {
        this.acceptedPaymetSystems = acceptedPaymetSystems;
    }
    
    public void addPaymetSystem(PaymentSystem paymentSystem){
        acceptedPaymetSystems.add(paymentSystem);
    }
    
    public void removePaymentSystem(PaymentSystem paymentSystem){
        acceptedPaymetSystems.remove(paymentSystem);
    }
}
