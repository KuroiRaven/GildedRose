package com.gildedrose;

import com.items.Item;
import com.items.ItemGeneric;
import java.util.Arrays;

class GildedRose {
    ItemGeneric[] items;
    
    public GildedRose(ItemGeneric[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            ((ItemGeneric)items[i]).updtQuality();
            ((ItemGeneric)items[i]).updtSellIn();
        }
    }
}