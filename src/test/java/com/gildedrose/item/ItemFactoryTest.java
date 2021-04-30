package com.gildedrose.item;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.gildedrose.Item;

import sun.jvm.hotspot.utilities.Assert;

class ItemFactoryTest {
    
    @Test
    public void conjuredItem() {
        Item item = new Item( "Conjured baked beans", 5, 5 );
        GildedRoseItem gildedRoseItem = ItemFactory.getWrappedItem( item );
        assertTrue(gildedRoseItem instanceof ConjuredItem, "Should be a conjured item");
    }
    
    @Test
    public void sulfurasItem() {
        Item item = new Item( "Sulfuras, Hand of Ragnaros", 5, 5 );
        GildedRoseItem gildedRoseItem = ItemFactory.getWrappedItem( item );
        assertTrue(gildedRoseItem instanceof Sulfuras, "Should be a Sulfuras item");
        assertEquals( item.quality, Sulfuras.SULFURAS_QUALITY, "Sulfuras quality should be fixed value" );
    }
    
    @Test
    public void agedBrieItem() {
        Item item = new Item( "Aged Brie", 5, 5 );
        GildedRoseItem gildedRoseItem = ItemFactory.getWrappedItem( item );
        assertTrue(gildedRoseItem instanceof AgedBrie, item.name + " should be AgedBrie");
    }
    
    @Test
    public void backStagePassItem() {
        Item item = new Item( "Backstage passes to a TAFKAL80ETC concert", 5, 5 );
        GildedRoseItem gildedRoseItem = ItemFactory.getWrappedItem( item );
        assertTrue(gildedRoseItem instanceof BackstagePass, item.name + " should be BackstagePass");
    }
    
    @Test
    public void standardItem() {
        Item item = new Item( "Big Mac", 5, 5 );
        GildedRoseItem gildedRoseItem = ItemFactory.getWrappedItem( item );
        assertTrue(gildedRoseItem instanceof StandardItem, item.name + " should be a StandardItem");
    }
}