package com.gildedrose.item;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.gildedrose.Item;

class ConjuredItemTest {
    
    @Test
    public void whenUpdatingQualityAndBeforeSellByDate_thenQualityReducesByTwo(){
        Item item = new Item( "Conjured tape measure", 5, 5);
        ConjuredItem conjuredItem = new ConjuredItem( item );
        assertEquals( 5, item.quality );
        conjuredItem.updateQuality();
        assertEquals( 3, item.quality );
        conjuredItem.updateQuality();
        assertEquals( 1, item.quality );
    }
    
    @Test
    public void whenUpdatingQualityAndOnSellByDate_thenQualityReducesByTwo(){
        Item item = new Item( "Conjured tape measure", 0, 5);
        ConjuredItem conjuredItem = new ConjuredItem( item );
        assertEquals( 5, item.quality );
        conjuredItem.updateQuality();
        assertEquals( 3, item.quality );
    }
    
    @Test
    public void whenUpdatingQualityAndAfterSellByDate_thenQualityReducesByFour(){
        Item item = new Item( "Conjured tape measure", -1, 17);
        ConjuredItem conjuredItem = new ConjuredItem( item );
        assertEquals( 17, item.quality );
        conjuredItem.updateQuality();
        assertEquals( 13, item.quality );
        conjuredItem.updateQuality();
        assertEquals( 9, item.quality );
    }
    
}