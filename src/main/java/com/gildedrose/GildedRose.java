package com.gildedrose;

import com.gildedrose.item.GildedRoseItem;
import com.gildedrose.item.ItemFactory;

class GildedRose {
    Item[] items;
    
    public GildedRose( Item[] items ) {
        this.items = items;
    }
    
    public void updateQuality() {
        for ( Item item : items ) {
            GildedRoseItem gildedRoseItem = ItemFactory.getWrappedItem( item );
            gildedRoseItem.ageByOneDay();
        }
    }
}