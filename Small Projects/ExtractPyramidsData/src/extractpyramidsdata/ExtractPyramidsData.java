/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extractpyramidsdata;

import pyramid.Pyramid;
import dao.PyramidCSVDAO;
import java.util.List;

/**
 *
 * @author saleh
 */
public class ExtractPyramidsData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PyramidCSVDAO pDAO = new PyramidCSVDAO();  
        List<Pyramid> pyramids = pDAO.readPyramidsFromCSV("/home/saleh/NetBeansProjects/ExtractPyramidsData/src/pyramids.csv");
        
        int i = 0;
        for(Pyramid p : pyramids){
            System.out.println("#" + (i++) + p);
        }
    }
    
}
