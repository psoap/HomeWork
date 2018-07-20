package com.epam.homework.first.entity;

import com.epam.homework.first.enums.PaymentSystem;
import com.epam.homework.first.enums.SearchEngine;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class c1LandingPage extends b1ElectronicMarketPlace {
    private Map<SearchEngine, Double>  avaragePositionByKeywords = new HashMap<>();
    private int sellingCounter;

    public void addSearchEngine(SearchEngine se, Double position) {
        avaragePositionByKeywords.put(se, position);
    }
    
    public double getAvaragePositionByKeywords(SearchEngine se) {
        return avaragePositionByKeywords.get(se);
    }

    public int getSellingCounter() {
        return sellingCounter;
    }

    public void setSellingCounter(int sellingCounter) {
        this.sellingCounter = sellingCounter;
    }
}