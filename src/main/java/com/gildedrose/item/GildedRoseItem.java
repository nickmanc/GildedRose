package com.gildedrose.item;

public interface GildedRoseItem {
    default public void ageByOneDay() {
        reduceSellIn();
        updateQuality();
    };
    
    public void updateQuality();
    
    public void reduceSellIn();
}
