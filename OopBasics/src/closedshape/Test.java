/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package closedshape;

/**
 *
 * @author saleh
 */
public class Test {
    //cs is ref from ClosedShape and pointer to Circle object
    //cs is ref from parent and pointer to child object
    ClosedShape cs;
    
    public void myMethod(){
        cs = new Circle();
        //can access x because the Test class inside the same pkg1
        cs.x = 5;
        cs.calculateArea();//from circle
        cs = new Rectangle();
        //Garbage Collector remove circle object
        cs.calculateArea();//from rectangle
    }
}
