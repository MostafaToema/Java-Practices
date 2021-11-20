/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import citiesandcountries.City;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author saleh
 */
public class CitiesCSVDAO implements CitiesDAO{
    public CitiesCSVDAO() {    
    }
    
    @Override
    public List<City> readCitiesFromCSV(String fileName) {
        City c = null;
        List<City> arrOfCities = new ArrayList<>();
        File citiesFileCSV = new File(fileName);
        
        try {
           Scanner scanLine = new Scanner(citiesFileCSV);
           scanLine.useDelimiter(",");
           
           while(scanLine.hasNextLine()){
               String[] line = scanLine.nextLine().split(",");
               c = new City(Integer.parseInt(line[0]), line[1], line[2], line[3], Integer.parseInt(line[4]));
               arrOfCities.add(c);
               
           }
           scanLine.close();
        } 
   
        catch (FileNotFoundException ex) {
            Logger.getLogger(CitiesCSVDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return arrOfCities;      
    }
}
