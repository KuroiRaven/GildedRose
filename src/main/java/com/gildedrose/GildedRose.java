package com.gildedrose;

import com.gildedrose.items.Item;
import com.gildedrose.items.ItemGeneric;
import java.util.Arrays;

class GildedRose {
    Item[] items;
    String[] legendary;
    
    public GildedRose(Item[] items) {
        this.items = items;
        this.legendary[1] = "Sulfuras, Hand of Ragnaros";
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            ((ItemGeneric)items[i]).updtQuality();
            ((ItemGeneric)items[i]).updtSellIn();
        }
    }
}