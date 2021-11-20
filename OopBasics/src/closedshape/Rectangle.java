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
public class Rectangle extends ClosedShape{
    int width, height;
    Point vertix;
    
    @Override
    public double calculateArea(){
        return width*height;
    }
    
    @Override
    public double calculateCircum(){
        return 2*(width+height);
    }
}
