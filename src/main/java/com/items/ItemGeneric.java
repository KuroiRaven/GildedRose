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
    
    protected boolean overMaxQuality(int quality){
        return quality > MAX_QUALITY;
    }
    
    protected boolean underMinQuality(int quality){
        return quality < MIN_QUALITY;
    }
    
    protected boolean underMinSellin(int sellIn){
        return sellIn < MIN_SELLIN;
    }
    
    public void updtQuality(){
        if(this.sellIn == 0){
            if(!underMinQuality(quality-(DECAY*2))){
                quality-=(DECAY*2);
            }
        }
        else{
            if(!underMinQuality(quality-DECAY)){
                this.quality-=DECAY;   
            }
        }
    }
    
    public void updtSellIn(){
        if(!underMinSellin(sellIn-DECAY)){
            this.sellIn-=DECAY;   
        }
    }
    
}
