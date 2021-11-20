/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import closedshape.ClosedShape;
import closedshape.Rectangle;
import closedshape.Circle;

/**
 *
 * @author saleh
 */
public class Test1 {
    //cs is ref from ClosedShape and pointer to Circle object
    //cs is ref from parent and pointer to child object
    ClosedShape cs;
    
    public void myMethod(){
        cs = new Circle();
        //can't access x because the Test1 class outside the pkg1
        //Error 
        //cs.x = 5;
        cs.calculateArea();//from circle
        cs = new Rectangle();
        //Garbage Collector remove circle object
        cs.calculateArea();//from rectangle
    }
}
