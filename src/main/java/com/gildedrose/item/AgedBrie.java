package com.gildedrose.item;

import com.gildedrose.Item;

public class AgedBrie extends StandardItem {
    public AgedBrie( Item item ) {
        super( item );
    }
    
    @Override
    public void updateQuality() {
        incrementQuality();
        if ( pastSellByDate() ) {
            incrementQuality();
        }
    }
}
