/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramid;


/**
 *
 * @author saleh
 */
public class Pyramid {
    private String pharaoh;
    private String modernName;
    private String site;
    private double height;
    
    public Pyramid(String pharaoh, String modernName, String site, double height) {
        this.pharaoh = pharaoh;
        this.modernName = modernName;
        this.site = site;
        this.height = height;
    }

    public String getPharaoh() {
        return pharaoh;
    }

    public void setPharaoh(String pharaoh) {
        this.pharaoh = pharaoh;
    }

    public String getModernName() {
        return modernName;
    }

    public void setModernName(String modernName) {
        this.modernName = modernName;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public String toString(){
        return pharaoh+"    "+modernName+"    "+site+"    "+height;    
    }
}
