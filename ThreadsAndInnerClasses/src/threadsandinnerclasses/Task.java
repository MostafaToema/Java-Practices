/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsandinnerclasses;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author saleh
 */
public class Task implements Runnable {

    @Override
    public void run() {
        int x= 15;
        do{
            System.out.println(Thread.currentThread().getName());
            System.out.println("x*x = "+ (x*x));
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Task.class.getName()).log(Level.SEVERE, null, ex);
            }
            x++;
        }while(x < 100);
    }
    
}
