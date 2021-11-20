/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package closedshape;

import common.OperAndCons;

/**
 *
 * @author saleh
 */
public abstract class ClosedShape implements OperAndCons{
    protected int x;
    
    @Override
    public String toString(){
        return this.getClass().getName();
    }
}
