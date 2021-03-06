/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countriesandcitieslist;

import citiesandcountries.City;
import citiesandcountries.Country;
import dao.CitiesCSVDAO;
import dao.CountriesCSVDAO;
import java.util.*;

/**
 *
 * @author saleh
 */
public class CountriesAndCitiesList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CountriesCSVDAO CoDAO = new CountriesCSVDAO();  
        List<Country> Countries = CoDAO.readCountriesFromCSV("/home/saleh/NetBeansProjects/CountriesAndCitiesList/src/countries.csv");
        
        CitiesCSVDAO CiDAO = new CitiesCSVDAO();  
        List<City> Cities = CiDAO.readCitiesFromCSV("/home/saleh/NetBeansProjects/CountriesAndCitiesList/src/cities.csv");
          
        String countryCode, cityCode;
        List<City> cityList;
        
        Map<String, List<City>> map = new HashMap<>();
        
        for(Country co : Countries){ 
            countryCode = co.getCode();
            cityList = new ArrayList<>();
            
            for(City ci : Cities){
                cityCode = ci.getCountryId(); 
                if(cityCode.equals(countryCode)){
                    cityList.add(ci);
                }
            }
            cityList.sort(Comparator.comparing(City::getPopulation));
            
            map.put(countryCode, cityList);
        }
        
        map.forEach((k, v) -> {
            System.out.println("key=" + k + ", value=" + v);
        });

    }   
}
