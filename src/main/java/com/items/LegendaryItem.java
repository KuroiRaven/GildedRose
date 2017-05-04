/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.items;

/**
 *
 * @author damien.faraone
 */
public class LegendaryItem extends ItemGeneric{
    public LegendaryItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    
    public void updtQuality(){
        this.quality = 80;
    }
    
    public void updtSellIn(){
        this.sellIn = sellIn;
    }
    
}
