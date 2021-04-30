package com.gildedrose.item;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.gildedrose.Item;

class AgedBrieTest {
    
    @Test
    public void whenBeforeSellByDate_qualityIncreasesByOne () {
        Item item = new Item( "Aged Brie", 5, 5);
        AgedBrie agedBrie = new AgedBrie( item );
        assertEquals( 5, item.quality );
        agedBrie.updateQuality();
        assertEquals( 6, item.quality );
        agedBrie.updateQuality();
        assertEquals( 7, item.quality );
    }
    
    @Test
    public void whenAtSellByDate_qualityIncreasesByOne () {
        Item item = new Item( "Aged Brie", 0, 5);
        AgedBrie agedBrie = new AgedBrie( item );
        assertEquals( 5, item.quality );
        agedBrie.updateQuality();
        assertEquals( 6, item.quality );
        agedBrie.updateQuality();
        assertEquals( 7, item.quality );
    }
    
    @Test
    public void whenAfterSellByDate_qualityIncreasesByTwo () {
        Item item = new Item( "Aged Brie", -1, 5);
        AgedBrie agedBrie = new AgedBrie( item );
        assertEquals( 5, item.quality);
        agedBrie.updateQuality();
        assertEquals( 7, item.quality  );
        agedBrie.updateQuality();
        assertEquals( 9, item.quality );
    }
}