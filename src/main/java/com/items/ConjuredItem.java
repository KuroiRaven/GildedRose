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
public class ConjuredItem extends ItemGeneric{
    private final int DECAY = 2;
    public ConjuredItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    
}
