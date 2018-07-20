package com.epam.homework.first.entity;

//ларек
public class c2Stall extends b2PhysicalMarketPlace{
    private boolean vodkaNaRarlivPosleMidnight = true;
    private boolean sellCigaretteToShkolota = true;

    public boolean isVodkaNaRarlivPosleMidnight() {
        return vodkaNaRarlivPosleMidnight;
    }

    public void setVodkaNaRarlivPosleMidnight(boolean vodkaNaRarlivPosleMidnight) {
        this.vodkaNaRarlivPosleMidnight = vodkaNaRarlivPosleMidnight;
    }

    public boolean isSellCigaretteToShkolota() {
        return sellCigaretteToShkolota;
    }

    public void setSellCigaretteToShkolota(boolean sellCigaretteToShkolota) {
        this.sellCigaretteToShkolota = sellCigaretteToShkolota;
    }
}