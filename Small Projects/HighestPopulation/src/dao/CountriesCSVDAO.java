/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import citiesandcountries.Country;
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
public class CountriesCSVDAO implements CountriesDAO{
    public CountriesCSVDAO() {    
    }
    
    @Override
    public List<Country> readCountriesFromCSV(String filename) {
        Country c = null;
        List<Country> arrOfCountries = new ArrayList<>();
        File CountriesFileCSV = new File(filename);
        
        try {
           Scanner scanLine = new Scanner(CountriesFileCSV);
           scanLine.useDelimiter(",");
           
           while(scanLine.hasNextLine()){
               String[] line = scanLine.nextLine().split(",");
               c = new Country(line[0], line[1]);
               arrOfCountries.add(c);
               
           }
           scanLine.close();
        } 
   
        catch (FileNotFoundException ex) {
            Logger.getLogger(CountriesCSVDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return arrOfCountries;      
    }

}
