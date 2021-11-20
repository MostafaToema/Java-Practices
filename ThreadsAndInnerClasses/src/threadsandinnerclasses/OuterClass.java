/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsandinnerclasses;

/**
 *
 * @author saleh
 */
public class OuterClass {
    private int x = 10;
    static int z = 100;
   
    //instance 
    public void myMeyhod(){
        InnerClass ic = new InnerClass();
        // OR InnerClass ic = this.new InnerClass();
        //this is hidden reference of OuterClass
    }
    
    //normal member inner class
    class InnerClass extends Thread {
        private int x = 10;
        
        public void myInnerMethod(){
            // refer to x in inner class
            x = 100; // OR this.x = 100;
            // refer to x in outer class 
            OuterClass.this.x = 200;
        }
        
    }

    //static member inner class deal with static members "only"
    //not need 
    static class StaticInnerClass{
        
        public void myStaticInnerMethod(){
            //Error because x is not static
            //x = 100; 
            System.out.println("z= "+ z);
        }
        
    }
    
    //Local inner class
    public void myMethod1(int z){
        final int i = 100;
        
        //deals with local variable or function paramerters
        class MyLocalClass {
            /* when you compile file include
               local inner class result is seperated 
               class file when we load this calss take 
               a copy of local variables of the method 
               and put these variables inside class then 
               must be the local variables declared final
               to ensure the local variables does not change*/
            
            public void myLocalMethod(){
                /*local variables referenced 
                  from an inner class must be 
                  final or effectively final*/
                
                //use z as effectively final
                System.out.println(z);
                //use i as final variable
                System.out.println(i);
            }
        }
        
        MyLocalClass mlc = new MyLocalClass();
        mlc.myLocalMethod();
        mlc = null;
    }
}


