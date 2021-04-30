package com.gildedrose.item;

import com.gildedrose.Item;

public class StandardItem implements GildedRoseItem {
    public static final int MAXIMUM_ALLOWABLE_QUALITY = 50;
    
    public static final int MINIMUM_ALLOWABLE_QUALITY = 0;
    
    protected Item item;
    
    public StandardItem( Item item ) {
        this.item = item;
    }
    
    @Override
    public void reduceSellIn() {
        item.sellIn--;
    }
    
    @Override
    public void updateQuality() {
        reduceQuality();
        if ( pastSellByDate() ) {
            reduceQuality();
        }
    }
    
    public void setQuality( int quality ) {
        item.quality = Math.min( MAXIMUM_ALLOWABLE_QUALITY, quality );
    }
    
    public void incrementQuality() {
        item.quality = Math.min( MAXIMUM_ALLOWABLE_QUALITY, item.quality + 1 );
    }
    
    public void reduceQuality() {
        item.quality = Math.max( MINIMUM_ALLOWABLE_QUALITY, item.quality - 1 );
    }
    
    public int getSellIn() {
        return item.sellIn;
    }
    
    protected boolean pastSellByDate() {
        return getSellIn() < 0;
    }
}
