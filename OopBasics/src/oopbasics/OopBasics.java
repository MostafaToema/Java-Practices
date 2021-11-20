/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopbasics;

import closedshape.Circle;
import closedshape.ClosedShape;
import building.AppartmentBuilding;

/**
 *
 * @author saleh
 */
public class OopBasics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle c = new Circle();
        AppartmentBuilding ab = new AppartmentBuilding();
        /*error because radius is private
          System.out.println(c.radius);*/
        c.setRadius(5);
        System.out.println(c.getRadius());
        System.out.println(c);
        System.out.println(ab);
        
        ClosedShape cc;
        cc = new Circle();
        /*can not access methods inside Circle class
          when we declare object from parent class
          can you methods using casting to Circle class*/ 
        Circle c1 = (Circle)cc;

        /*Note
        Truncation : cutting off the digit to
                     the right a decimal point .
        */
        
    }
    
}
