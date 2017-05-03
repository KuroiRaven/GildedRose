/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gildedrose.legendaryControl;

import com.gildedrose.Item;
import java.util.Arrays;

/**
 *
 * @author damien.faraone
 */
public class legendaryControls {
    private static final String[] items = {"Sulfuras, Hand of Ragnaros"};
    
    public static boolean isLegendary(Item item){
        return Arrays.asList(items).contains(item.name);
    }
}
