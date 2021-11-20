/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import pyramid.Pyramid;

/**
 *
 * @author saleh
 */
public interface PyramidDAO {
    public List<Pyramid> readPyramidsFromCSV(String filename);
    public Pyramid createPyramids(String[] metadata);
}
