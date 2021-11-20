/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package closedshape;

import java.awt.Point;

/**
 *
 * @author saleh
 */
public class Triangle extends ClosedShape{
    Point vertix1,vertix2,vertix3;
    float height, base;
    String triangleType;
    
    @Override
    public double calculateArea(){
        return 0.5*base*height;
    }
    
    @Override
    public double calculateCircum(){
        //return summation of distance between verticies;
        //to avoid an error
        return 0;
    }
}
