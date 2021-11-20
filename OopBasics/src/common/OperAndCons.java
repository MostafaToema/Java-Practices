/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

/**
 *
 * @author saleh
 */
public interface OperAndCons {
    //all attributes is public-static-final     
    float pi = 22/7;
    //all methods is public-abstract 
    default double calculateArea(){
        return 20;
    }
    double calculateCircum();
}
