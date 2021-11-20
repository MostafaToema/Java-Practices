/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import citiesandcountries.City;
import java.util.List;

/**
 *
 * @author saleh
 */
public interface CitiesDAO {
    public List<City> readCitiesFromCSV(String filename);  
}
