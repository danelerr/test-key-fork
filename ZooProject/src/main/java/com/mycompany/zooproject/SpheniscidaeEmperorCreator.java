/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zooproject;

/**
 *
 * @author sebastianpadilla
 */
public class SpheniscidaeEmperorCreator extends SpheniscidaeFactory {

    @Override
    public Spheniscidae createSpheniscidae() {
        return new SpheniscidaeEmperor();
    }
    
}
