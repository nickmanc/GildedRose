package com.gildedrose.item;

import com.gildedrose.Item;

public class ItemFactory {
    
    public static final String CONJURED_ITEM_START_TEXT = "Conjured";
    
    public static final String SULFURAS_ITEM_NAME = "Sulfuras, Hand of Ragnaros";
    
    public static final String AGED_BRIE_ITEM_NAME = "Aged Brie";
    
    public static final String BACKSTAGE_PASS_ITEM_NAME = "Backstage passes to a TAFKAL80ETC concert";
    
    public static GildedRoseItem getWrappedItem( Item item ) {
        if (item.name.startsWith( CONJURED_ITEM_START_TEXT )) {
            return new ConjuredItem( item );
        }
        switch (item.name) {
            case SULFURAS_ITEM_NAME: return new Sulfuras( item );
            case AGED_BRIE_ITEM_NAME: return new AgedBrie( item );
            case BACKSTAGE_PASS_ITEM_NAME: return new BackstagePass( item );
        }
        return new StandardItem( item );
    }
}