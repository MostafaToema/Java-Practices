/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcomparison;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
/**
 *
 * @author saleh
 */
public class StringComparison {
    
    /**
     *
     * @param str1
     * @param str2
     * @param BP
     * @return str1 or str2
     */
    public static String betterString(String str1, String str2, BiPredicate<String, String> BP){
        if(BP.test(str1, str2)){
            return str1;
        }
        else{
            return str2;
        }
    }

    /**
     *
     * @param str1
     * @return true or false
     */
    public static boolean isLetters(String str1){
        for(char c : str1.toCharArray()){
            if(!Character.isLetter(c)){
                return false;
            } 
        }
        return true;
    }
    
    /**
     *
     * @param str1
     * @param P
     * @return true or false 
     */
    public static boolean onlyLetters(String str1, Predicate<String> P){
        return P.test(str1);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String string1 = "Hello";
        String string2 = "hello";
        String string3 = "hello1";
        
        //part1
        String longer, first;
        longer = StringComparison.betterString(string1, string2, (s1, s2) -> s1.length() > s2.length());
        System.out.println(longer);
        first = StringComparison.betterString(string1, string2, (s1, s2) -> true);
        System.out.println(first);
        
        //part2
        boolean result;
        result = StringComparison.onlyLetters(string1, StringComparison::isLetters); 
        System.out.println(result);
        result = StringComparison.onlyLetters(string3, StringComparison::isLetters);
        System.out.println(result);
        
    }    
}
