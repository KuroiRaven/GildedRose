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
public class EventItem extends ItemGeneric{
    
    private final int NEAR_LAST = 10;
    private final int LAST_MINUTE = 5;
    private final int END_EVENT = 0;
    
    public EventItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updtQuality() {        
        if(sellIn == END_EVENT){
            quality = 0;
        }else if(sellIn <= LAST_MINUTE){
            quality += DECAY*3;
        }else if(sellIn <=NEAR_LAST){
            quality += DECAY*2;
        }else{
            super.updtQuality();
        }
    }
    
    
    
}
