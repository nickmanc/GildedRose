package com.gildedrose.item;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.gildedrose.Item;

class StandardItemTest {
    @Test
    public void whenBeforeSellByDate_qualityDecreasesByOne () {
        Item item = new Item( "Tesco value sausages", 5, 5);
        StandardItem standardItem = new StandardItem( item );
        assertEquals( 5, item.quality );
        standardItem.updateQuality();
        assertEquals( 4, item.quality );
        standardItem.updateQuality();
        assertEquals( 3, item.quality );
    }
    
    @Test
    public void whenAtSellByDate_qualityDecreasesByOne () {
        Item item = new Item( "Tesco value sausages", 0, 5);
        StandardItem standardItem = new StandardItem( item );
        assertEquals( 5, item.quality );
        standardItem.updateQuality();
        assertEquals( 4, item.quality );
    }
    
    @Test
    public void whenAfterSellByDate_qualityDecreasesByTwo () {
        Item item = new Item( "Tesco value sausages", -1, 5);
        StandardItem standardItem = new StandardItem( item );
        assertEquals( 5, item.quality);
        standardItem.updateQuality();
        assertEquals( 3, item.quality  );
        standardItem.updateQuality();
        assertEquals( 1, item.quality );
    }
    
    @Test
    public void whenDecrementingSellIn_sellInReducesByOne () {
        Item item = new Item( "Tesco value sausages", 1, 5);
        StandardItem standardItem = new StandardItem( item );
        assertEquals( 1, standardItem.getSellIn());
        standardItem.reduceSellIn();
        assertEquals( 0, standardItem.getSellIn()  );
        standardItem.reduceSellIn();
        assertEquals( -1, standardItem.getSellIn() );
    }
    
    @Test
    public void whenSettingQuality_qualityCannotExceedFifty () {
        Item item = new Item( "Tesco value sausages", 1, 5);
        StandardItem standardItem = new StandardItem( item );
        standardItem.setQuality( 55 );
        assertEquals( 50, item.quality);
    }
    @Test
    public void whenIncrementingQuality_qualityCannotExceedFifty () {
        Item item = new Item( "Tesco value sausages", 1, 49);
        StandardItem standardItem = new StandardItem( item ){
            @Override
            public void updateQuality() {
                incrementQuality();
            }
        };
        assertEquals( 49, item.quality);
        standardItem.updateQuality();
        assertEquals( 50, item.quality);
        standardItem.updateQuality();
        assertEquals( 50, item.quality);
    }
    
}