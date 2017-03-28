package Cursada.TrabajosPracticos.TrabajoPractico2;

import java.util.Scanner;

/**
 * Created by DiegoMancini on 5/3/17.
 */
public class ComplexNumber {

    private double realNumber;
    private double imaginaryNumber;
    private Scanner unScanner;


    public ComplexNumber(double realNumber, double imaginaryNumber) {
        this.realNumber = realNumber;
        this.imaginaryNumber = imaginaryNumber;
    }

    public ComplexNumber() {
        System.out.println("Ingrese el numero real del numero complejo: ");
        realNumber = getUnScanner().nextDouble();
        System.out.println("Ingrese el numero imaginario del numero complejo: ");
        imaginaryNumber = getUnScanner().nextDouble();
    }

    public double getRealNumber() {
        return realNumber;
    }

    public double getImaginaryNumber() {
        return imaginaryNumber;
    }

    public Scanner getUnScanner() {
        return unScanner;
    }

    public void add(ComplexNumber anyComplexNumber) {
        realNumber += anyComplexNumber.getRealNumber();
        imaginaryNumber += anyComplexNumber.getImaginaryNumber();
    }

    public void substract(ComplexNumber anyComplexNumber) {
        realNumber -= anyComplexNumber.getRealNumber();
        imaginaryNumber -= anyComplexNumber.getImaginaryNumber();
    }

    public void divide(ComplexNumber anyComplexNumber) {
      this.multiply(anyComplexNumber.denominator());
    }

    public ComplexNumber denominator() {
        double denominator = realNumber * realNumber + imaginaryNumber * imaginaryNumber;
        return new ComplexNumber(realNumber / denominator, -imaginaryNumber / denominator);
    }

    public void multiply(ComplexNumber anyComplexNumber) {
        realNumber = realNumber * anyComplexNumber.getRealNumber() - imaginaryNumber * anyComplexNumber.getImaginaryNumber();
        imaginaryNumber = realNumber * anyComplexNumber.getRealNumber() + imaginaryNumber * anyComplexNumber.getImaginaryNumber();
    }

    public double absoluteValue() {
        double module = 0;
        module = (Math.sqrt(Math.pow(realNumber , 2) + Math.pow(imaginaryNumber , 2)));
        return module;
    }

    public void print() {
        System.out.println("Complex Number : " + realNumber + " " + imaginaryNumber + "i");
    }
}
