/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.util.Scanner;
public class rationalCode  {
 public static void main(String[] args) {
 // rational   

    Scanner ss = new Scanner(System.in); 

  

        System.out.print("Enter the first rational number (numerator/denominator): "); 

        double numerator1 = ss.nextDouble(); 

        double denominator1 = ss.nextDouble(); 

        Rational r1 = new Rational(numerator1, denominator1); 

  

        System.out.print("Enter the second rational number (numerator/denominator): "); 

        double numerator2 =ss.nextDouble(); 

        double denominator2 = ss.nextDouble(); 

        Rational r2 = new Rational(numerator2, denominator2); 

  

        Rational sum = r1.add(r2); 

        Rational product = r1.mul(r2); 

  

        System.out.print("The sum is "); 

        sum.display(); 

        System.out.print("The product is "); 

        product.display(); 

  

    

        

 }  
}
