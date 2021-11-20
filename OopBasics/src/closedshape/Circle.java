/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package closedshape;

import java.awt.Point;
import common.OperAndCons;
/**
 *
 * @author saleh
 */
public class Circle extends ClosedShape{
    private float radius;
    Point vertix;
    
    @Override
    public double calculateArea(){
        return OperAndCons.pi*radius*radius;      
    }
    
    @Override
    public double calculateCircum(){
        return 2*OperAndCons.pi*radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        if(radius > 0)
            this.radius = radius;
    }

    public Point getVertix() {
        return vertix;
    }

    public void setVertix(Point vertix) {
        this.vertix = vertix;
    }

    @Override
    public String toString() {
        return super.toString() + " radius = " + radius; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
