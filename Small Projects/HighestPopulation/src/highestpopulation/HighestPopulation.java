/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highestpopulation;

import citiesandcountries.City;
import citiesandcountries.Country;
import dao.CitiesCSVDAO;
import dao.CountriesCSVDAO;
import java.util.*;

/**
 *
 * @author saleh
 */
public class HighestPopulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CountriesCSVDAO CoDAO = new CountriesCSVDAO();  
        List<Country> Countries = CoDAO.readCountriesFromCSV("/home/saleh/NetBeansProjects/HighestPopulation/src/countries.csv");
        
        CitiesCSVDAO CiDAO = new CitiesCSVDAO();  
        List<City> Cities = CiDAO.readCitiesFromCSV("/home/saleh/NetBeansProjects/HighestPopulation/src/cities.csv");
          
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
        map.remove(" South\"");
        
        /*
        map.forEach((k, v) -> {
            System.out.println("key=" + k + ", value=" + v);
        });
        */
   
        // Find the highest population city for each country
        System.out.println("----------------------------------------------------");
        System.out.println("the highest population city for each country");
        map.forEach((k, v) -> {
            // Each country city list is already sorted from lowest to highest
            System.out.println("***********************************************");
            System.out.println(k);
            if(!v.isEmpty()){
                System.out.println(v.get(v.size() - 1));
            }
        });
        
        
        // Anthor way to find the highest population city for each country
        /*
        Map<String, List<City>> map2 = Cities.stream()
                                             .collect(Collectors.groupingBy(City::getCountryId));
        map2.forEach((k, v) -> {
            System.out.println("key=" + k + ", value=" + v);
        });
        */
        
        // Find the highest population city capital
        System.out.println("----------------------------------------------------");
        System.out.println("the highest population city capital");
        int highestPopulationCityCapital = Cities.stream()
                     .filter(c -> c.getCapital().equals("primary"))
                     .map(City::getPopulation)
                     .sorted(Comparator.reverseOrder())
                     .findFirst().get();
         
        System.out.println(highestPopulationCityCapital);
        
    }   
}
