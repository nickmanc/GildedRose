package com.gildedrose.item;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.gildedrose.Item;

class SulfurasTest {
    @Test
    public void whenCreatingANewSulfuras_qualityIsAlwaysEighty() {
        Item item = new Item( "test", 14, 5 );
        Sulfuras sulfuras = new Sulfuras( item );
        assertEquals( Sulfuras.SULFURAS_QUALITY, item.quality );
    }
    
    @Test
    public void whenUpdatingQuality_qualityIsAlwaysEighty() {
        Item item = new Item( "test", 14, 5 );
        Sulfuras sulfuras = new Sulfuras( item );
        assertEquals( Sulfuras.SULFURAS_QUALITY, item.quality );
        sulfuras.updateQuality();
        assertEquals( Sulfuras.SULFURAS_QUALITY, item.quality );
    }
    
    @Test
    public void whenUpdatingQuality_sellInIsNotChanged() {
        Item item = new Item( "test", 14, 5 );
        Sulfuras sulfuras = new Sulfuras( item );
        assertEquals( 14, item.sellIn );
        sulfuras.reduceSellIn();
        assertEquals( 14, item.sellIn );
    }
}