/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filescanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author saleh
 */
public class FileScanner {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        // read word by word
        File file = new File("/home/saleh/NetBeansProjects/pyramids.csv");
        Scanner sc = new Scanner(file);
        sc.useDelimiter(",");
        
        //read word by word
        while (sc.hasNext()) {
            System.out.println(sc.next());
        }
        sc.close();
        
        //read line by line
        while (sc.hasNextLine()) {
            String row = sc.nextLine();
            System.out.println(row);
        }
        sc.close();
    }
    
}
