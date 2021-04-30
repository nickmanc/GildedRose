package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ItemTest {
    
    @Test
    public void testConstructor() {
        Item item = new Item ("test", 15, 23);
        assertEquals( "test", item.name);
        assertEquals( 15, item.sellIn );
        assertEquals( 23, item.quality );
    }
    
    @Test
    public void testToString() {
        Item item = new Item ("test", 15, 23);
        assertEquals( item.toString(), "test, 15, 23" );
    }
}