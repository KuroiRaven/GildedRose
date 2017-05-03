/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gildedrose.qualityControl;

import com.gildedrose.Item;

/**
 *
 * @author damien.faraone
 */
public class itemControls {
    private int MAX_QUALITY = 50;
    private int MIN_QUALITIY = 0;
    
    public static void decQuality(Item item,int dec){
        item.quality-=dec;
    }
    
}
