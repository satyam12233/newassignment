package com.demo;
/*Print the sum, difference and product of two complex numbers by creating a class named 'Complex'
 *  with separate methods for each operation whose real and imaginary parts are entered by user.
 */
public class ComplexNumber { 
    private final double real; 
    private final double imaginary; 
 public ComplexNumber(double real, double imaginary) { 
     this.real = real; 
     this.imaginary = imaginary; 
     }
 //addition
 public ComplexNumber sum(ComplexNumber other) {
     double r = this.real + other.real; 
     double i = this.imaginary + other.imaginary; 
     return new ComplexNumber(r, i); 
     }

 

 //difference
 public ComplexNumber difference(ComplexNumber other) {
     double r = this.real - other.real;
     double i = this.imaginary - other.imaginary;
     return new ComplexNumber(r, i); 
     }
 //multiplication
 public ComplexNumber multiplication(ComplexNumber other) {
     double r = this.real * other.real;
     double i = this.imaginary * other.imaginary;
     return new ComplexNumber(r, i); 
     }
public double getReal() {
    return real; 
    } 
public double getImaginary() {
    return imaginary; 
    } 
@Override 
public String toString() {
    return real + " + " + imaginary + "i"; 
    } 
}
class Main {
    public static void main(String[] args) { 
        // first complex number 
        ComplexNumber c1 = new ComplexNumber(2, 4); 
        // Second complex number
        ComplexNumber c2 = new ComplexNumber(3, 5);
        ComplexNumber sum = c1.sum(c2); 
        ComplexNumber difference = c1.difference(c2);
        ComplexNumber multiplication = c1.multiplication(c2);
        System.out.println("first complex number: " + c1); 
        System.out.println("second complex number: " + c2); 
        System.out.println("sum of two complex numbers: " + sum); 
        System.out.println("difference of two complex numbers: " + difference);
        System.out.println("multiplication of two complex numbers: " + multiplication);
        }
}