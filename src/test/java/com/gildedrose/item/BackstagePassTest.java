package com.gildedrose.item;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.gildedrose.Item;

class BackstagePassTest {
    @Test
    public void whenPastSellByDate_thenValueIsZero () {
        Item item = new Item( "Backstage passes to a TAFKAL80ETC concert", -1, 5);
        BackstagePass backstagePass = new BackstagePass( item );
        backstagePass.updateQuality();
        assertEquals( 0, item.quality );
    }
    
    @Test
    public void whenMoreThanTenDaysAway_thenQualityIncreasesBy1 (){
        Item item = new Item( "Backstage passes to a TAFKAL80ETC concert", 15, 5);
        BackstagePass backstagePass = new BackstagePass( item );
        backstagePass.updateQuality();
        assertEquals( 6, item.quality );
    }
    
    @Test
    public void whenLessThanTenDaysAway_thenQualityIncreasesBy2 (){
        Item item = new Item( "Backstage passes to a TAFKAL80ETC concert", 9, 5);
        BackstagePass backstagePass = new BackstagePass( item );
        backstagePass.updateQuality();
        assertEquals( 7, item.quality );
    }
    
    @Test
    public void whenLessThanFiveDaysAway_thenQualityIncreasesBy3 (){
        Item item = new Item( "Backstage passes to a TAFKAL80ETC concert", 4, 5);
        BackstagePass backstagePass = new BackstagePass( item );
        backstagePass.updateQuality();
        assertEquals( 8, item.quality );
    }
    
}