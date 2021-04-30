package com.gildedrose.item;

import com.gildedrose.Item;

public class Sulfuras extends StandardItem {
    
    public static final int SULFURAS_QUALITY = 80;
    
    public Sulfuras( Item item ) {
        super( item);
        item.quality = SULFURAS_QUALITY;
    }

    @Override
    public void updateQuality() {
    }
    
    @Override
    public void reduceSellIn() {
    }
}
