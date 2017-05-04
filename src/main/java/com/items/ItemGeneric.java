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
public class ItemGeneric extends Item {
    
    protected final int MAX_QUALITY = 50;
    protected final int MIN_QUALITY = 0;
    protected final int MIN_SELLIN = 0;
    protected final int DECAY = 1;
    public ItemGeneric(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    
    public void updtQuality(){
        if(this.sellIn == 0){
            if(quality-(DECAY*2)>=0){
                quality-=(DECAY*2);
            }
        }
        else{
            if(quality-DECAY >=0){
                this.quality-=DECAY;   
            }
        }
    }
    
    public void updtSellIn(){
        if(sellIn-DECAY >=MIN_SELLIN){
            this.sellIn-=DECAY;   
        }
    }
    
}
