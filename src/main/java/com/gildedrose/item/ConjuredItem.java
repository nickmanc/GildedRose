package com.gildedrose.item;

import com.gildedrose.Item;

public class ConjuredItem extends StandardItem {
    public ConjuredItem( Item item ) {
        super( item );
    }
    
    @Override
    public void updateQuality() {
        super.updateQuality();
        super.updateQuality();
    }
}
