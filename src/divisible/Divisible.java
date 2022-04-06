/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisible;

/**
 *
 * @author admin
 */
public class Divisible {
 public static void main(String[] args) {
        System.out.println(is_divisible(75));
    }
    
    public static String is_divisible(int a){
        
        int sumOfDigits = 0;
        char n;
        if (a != 0) {
            
            for (int i = 0; i < String.valueOf(a).length() ; i++) {
             n = String.valueOf(a).charAt(i);
             sumOfDigits += Character.getNumericValue(n);
        }
            if (a % sumOfDigits == 0) {
            return "True";
        }
        }
        
        
        return "False";
    }
}
