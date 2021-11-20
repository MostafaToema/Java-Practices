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
public class ThreadsAndInnerClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OuterClass oc = new OuterClass();
        OuterClass.InnerClass ic = oc.new InnerClass();
        //test
        OuterClass.InnerClass ic1 = new OuterClass().new InnerClass();
        
        OuterClass.StaticInnerClass sic = new OuterClass.StaticInnerClass();
    
        Task t = new Task();
        Thread th = new Thread(t);
        th.setName("First Thread");
        //windows schedule is time slicing not priority
        //round robin per queue
        th.setPriority(Thread.MAX_PRIORITY);
        th.start();
        
        ////////////anthor thread///////////////
        Task t1 = new Task();
        Thread th1 = new Thread(t1);
        th1.setName("Second Thread");
        th1.start();
        
        /*Anonymous inner class using lambda expression
          does not generate .class file*/ 
        Thread th2 = new Thread(() -> {
            while(true){
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadsAndInnerClasses.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        th2.setName("Anthor Thread with different task");
        th2.start();
        
        // Anonymous inner class $1
        // object from unnamed class extend task that implement Runnable(). 
        Thread th3 = new Thread(new Task(){
            public void run(){
                System.out.println("new task1");
            }
            
        });
        
        th3.start();
        
        //Anonymous inner class$2
        Thread th4 = new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("new task2");
            }
            
        });
        
        th4.start();
    }
    
}
