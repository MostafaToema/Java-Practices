/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import closedshape.Circle;

/**
 *
 * @author saleh
 */
public class CircleChild extends Circle{
    //Constructor of calss
    public CircleChild(){
        //x is available on class and sub-classes and sub-classes in other pkg's
        x = 10;
    }
    
}
