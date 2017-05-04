package com.gildedrose;

import com.items.AgingItem;
import com.items.ConjuredItem;
import com.items.Item;
import com.items.ItemGeneric;
import com.items.LegendaryItem;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class GildedRoseTest {

    @Test
    public void foo() {
        ItemGeneric[] items;
        items = new ItemGeneric[] { new ItemGeneric("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

    @Test
    public void testSellIn() {
        ItemGeneric[] items = new ItemGeneric[] { new ItemGeneric("foo", 5, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(4, app.items[0].sellIn);
    }
    
    @Test
    public void testQuality() {
        ItemGeneric[] items = new ItemGeneric[] { new ItemGeneric("foo", 5, 30) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(29, app.items[0].quality);
    }
    
    @Test
    public void testLegendary(){
        ItemGeneric[] items = new ItemGeneric[] {new LegendaryItem("Sulfuras du cul", 100,100)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(80, app.items[0].quality);
    }
    
    @Test
    public void testConjured(){
        ItemGeneric[] items = new ItemGeneric[] {new ConjuredItem("letrucconjuré", 3, 6)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(5, app.items[0].quality);
        assertEquals(2, app.items[0].sellIn);
    }
    
    @Test
    public void testAging(){
        ItemGeneric[] items = new ItemGeneric[] {new AgingItem("letrucvieuxc'estbon", 2, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(1, app.items[0].quality);
        assertEquals(1, app.items[0].sellIn);
    }
}
