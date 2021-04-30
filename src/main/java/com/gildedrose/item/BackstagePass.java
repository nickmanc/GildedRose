package com.gildedrose.item;

import com.gildedrose.Item;

public class BackstagePass extends StandardItem {
    public BackstagePass( Item item ) {
        super( item );
    }
    
    @Override
    public void updateQuality() {
        if ( pastSellByDate() ) {
            setQuality( MINIMUM_ALLOWABLE_QUALITY );
        }
        else {
            incrementQuality();
            if ( showInLessThanTenDays() ) {
                incrementQuality();
            }
            if ( showInLessThanFiveDays() ) {
                incrementQuality();
            }
        }
    }
    
    private boolean showInLessThanFiveDays() {
        return getSellIn() < 5;
    }
    
    private boolean showInLessThanTenDays() {
        return getSellIn() < 10;
    }
}
