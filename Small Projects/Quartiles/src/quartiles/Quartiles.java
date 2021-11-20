/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quartiles;

import pyramid.Pyramid;
import dao.PyramidCSVDAO;
import java.util.*;

/**
 *
 * @author saleh
 */
public class Quartiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PyramidCSVDAO pDAO = new PyramidCSVDAO();  
        List<Pyramid> pyramids = pDAO.readPyramidsFromCSV("/home/saleh/NetBeansProjects/Quartiles/src/pyramids.csv");
        
 
        long size = pyramids.size();
        System.out.println(size);
       
        // Find the average of pyramid heights
        double average = pyramids.stream()
                .mapToDouble(Pyramid::getHeight)
                .average().getAsDouble();
        
        System.out.println("The average of pyramid heights is: " + average);
        
        // Find the median of pyramid heights
        double median = pyramids.stream()
                .mapToDouble(Pyramid::getHeight)
                .sorted()
                .skip(((size + 1) / 2) - 1)
                .limit(2 - size % 2)
                .average().getAsDouble();
        
        System.out.println("the median(second quartile) of pyramid heights is: " + median);
        
        
        // Find the lower(first) quartile of pyramid heights
        double lowerQuartile = pyramids.stream()
                .mapToDouble(Pyramid::getHeight)
                .sorted()
                .skip(((size + 1) / 4) - 1)
                .limit(2 - size % 2)
                .average().getAsDouble();
        
        System.out.println("the lower(first) quartile of pyramid heights is: " + lowerQuartile);
        
        // Find the upper(third) quartile of pyramid heights
        double upperQuartile = pyramids.stream()
                .mapToDouble(Pyramid::getHeight)
                .sorted()
                .skip(((size + 1) * 3 / 4) - 1)
                .limit(2 - size % 2)
                .average().getAsDouble();
        
        System.out.println("the upper(third) quartile of pyramid heights is: " + upperQuartile);
        
    }
    
}
