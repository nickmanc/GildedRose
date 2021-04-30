package com.gildedrose;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class GildedRoseTest {
    
    @Test
    public void testConstructor() {
        Item [] items = {new Item("a", 1,1), new Item ("b",2,2), new Item ("c",3,3) };
        GildedRose gildedRose = new GildedRose( items );
        assertEquals( 3, gildedRose.items.length );
        assertEquals( "a", gildedRose.items[0].name );
        assertEquals( 2, gildedRose.items[1].sellIn );
        assertEquals( 3, gildedRose.items[2].quality );
    }
    
    @Test
    public void testSellInReducedAndQualityUpdatedForAllItems() {
        Item [] items = {new Item("a", 1,1), new Item ("b",2,2), new Item ("c",3,3) };
        GildedRose gildedRose = new GildedRose( items );
        gildedRose.updateQuality();
        assertEquals( 0, gildedRose.items[0].sellIn );
        assertEquals( 1, gildedRose.items[1].sellIn );
        assertEquals( 2, gildedRose.items[2].sellIn );
        assertEquals( 0, gildedRose.items[0].quality );
        assertEquals( 1, gildedRose.items[1].quality );
        assertEquals( 2, gildedRose.items[2].quality );
    }
}