package com.gildedrose;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@Disabled
class LegacyGildedRoseTest {

    @Test
    void qualityReducesBy1PerDay() {
        Item[] items = new Item[] { new Item("foo", 5, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
        assertEquals(9, app.items[0].quality);
        assertEquals(4, app.items[0].sellIn);
    
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
        assertEquals(8, app.items[0].quality);
        assertEquals(3, app.items[0].sellIn);
    }
    
    @Test
    void qualityReducesBy2PerDayAfterSellBy() {
        Item[] items = new Item[] { new Item("foo", 1, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
        assertEquals(9, app.items[0].quality);
        assertEquals(0, app.items[0].sellIn);
        
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
        assertEquals(7, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
        assertEquals(5, app.items[0].quality);
        assertEquals(-2, app.items[0].sellIn);
    }
    
    @Test
    void qualityDoesNotGetNegtive() {
        Item[] items = new Item[] { new Item("foo", 5, 1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
        assertEquals(0, app.items[0].quality);
        
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
        assertEquals(0, app.items[0].quality);
    }
    
    
    @Test
    void AgedBrieQualityIncreasesWithAge() {
        Item[] items = new Item[] { new Item("Aged Brie", 5, 1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(2, app.items[0].quality);
        assertEquals(4, app.items[0].sellIn);
        
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(3, app.items[0].quality);
        assertEquals(3, app.items[0].sellIn);
    }
    
    @Test
    void qualityDoesNotGetAbove50() {
        Item[] items = new Item[] { new Item("Aged Brie", 5, 45) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(46, app.items[0].quality);
        assertEquals(4, app.items[0].sellIn);
        
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(47, app.items[0].quality);
        assertEquals(3, app.items[0].sellIn);
        
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(48, app.items[0].quality);
        assertEquals(2, app.items[0].sellIn);
        
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(49, app.items[0].quality);
        assertEquals(1, app.items[0].sellIn);
        
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(50, app.items[0].quality);
        assertEquals(0, app.items[0].sellIn);
        
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(50, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
    }
    
    @Test
    void SulfurasIsALegendaryItem() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 5, 80) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(80, app.items[0].quality);
        assertEquals(5, app.items[0].sellIn);
        
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(80, app.items[0].quality);
        assertEquals(5, app.items[0].sellIn);
    }
    
    @Test
    void BackstagePassesIncreaseInQualityUntilTheyAreWorthlessAfterTheEvent(){
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 12, 20) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(21, app.items[0].quality);
        assertEquals(11, app.items[0].sellIn);
        
        app.updateQuality();
        assertEquals(22, app.items[0].quality);
        assertEquals(10, app.items[0].sellIn);
        app.updateQuality();
        assertEquals(24, app.items[0].quality);
        assertEquals(9, app.items[0].sellIn);
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        assertEquals(38, app.items[0].quality);
        assertEquals(3, app.items[0].sellIn);
        app.updateQuality();
        assertEquals(41, app.items[0].quality);
        assertEquals(2, app.items[0].sellIn);
        app.updateQuality();
        assertEquals(44, app.items[0].quality);
        assertEquals(1, app.items[0].sellIn);
        app.updateQuality();
        assertEquals(47, app.items[0].quality);
        assertEquals(0, app.items[0].sellIn);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
        
    }
    
}
