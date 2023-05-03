/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadir
 */
package Main;
public class Rational {
     private double numerator;
    private double denominator;

  
public Rational (double newnumerator, double newdenominator){
this.denominator=1;
this.numerator=1;}

    public double getNumerator() {
        return numerator;
    }

    public void setNumerator(double numerator) {
        this.numerator = numerator;
                
                
    }

    public double getDenominator() {
        return denominator;
    }

    public void setDenominator(double denominator) {
        this.denominator = denominator;
    }
   
    public Rational add(Rational r)
    {

        double newnumerator = numerator * r.denominator + denominator * r.numerator;
        double newdenominator = denominator * r.denominator;
        return new Rational(newnumerator,newdenominator);
    }
    public Rational mul(Rational r)
    {
  
       double newnumerator =numerator * r.numerator;
      double newdenominator =denominator * r.denominator;
        return new Rational(newnumerator,newdenominator);
    }
    public  void display (){
        System.out.println( numerator+"/"+denominator);
     }

 
}
