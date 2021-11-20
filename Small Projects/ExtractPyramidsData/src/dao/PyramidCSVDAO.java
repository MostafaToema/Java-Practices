/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import pyramid.Pyramid;

/**
 *
 * @author saleh
 */

public class PyramidCSVDAO implements PyramidDAO{

    public PyramidCSVDAO() {    
    }
    
    @Override
    public List<Pyramid> readPyramidsFromCSV(String fileName) {
        Pyramid p = null;
        List<Pyramid> arrOfPyramid = new ArrayList<>();
        File pyramidFileCSV = new File(fileName);
        
        try {
           Scanner scanLine = new Scanner(pyramidFileCSV);
           scanLine.useDelimiter(",");
           
           while(scanLine.hasNextLine()){
               String[] line = scanLine.nextLine().split(",");
               if(line[7].matches("[0-9]+")){
                   p = new Pyramid(line[0], line[2], line[4], Double.parseDouble(line[7]));
                   arrOfPyramid.add(p);
               }
           }
           scanLine.close();
        } 
   
        catch (FileNotFoundException ex) {
            Logger.getLogger(PyramidCSVDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return arrOfPyramid;      
    }

    @Override
    public Pyramid createPyramids(String[] metadata) {

        return null;
    }
    
}
