/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gildedrose.items;

/**
 *
 * @author damien.faraone
 */
public class AgingItem extends ItemGeneric{

    public AgingItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updtQuality() {
        if(quality < MAX_QUALITY){
            quality+=DECAY;  
        }
    }
    
    
    
}
