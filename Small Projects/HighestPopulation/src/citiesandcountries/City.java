/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citiesandcountries;

/**
 *
 * @author saleh
 */
public class City {
    private int cityId;
    private String city;
    private String countryId;
    private String capital;
    private int population;

    public City(int cityId, String city, String countryId, String capital, int population) {
        this.cityId = cityId;
        this.city = city;
        this.countryId = countryId;
        this.capital = capital;
        this.population = population;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }    
    
    @Override
    public String toString(){
        return " City = " + city + " Population = " + population;
    }
}
