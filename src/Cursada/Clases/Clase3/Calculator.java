package Cursada.Clases.Clase3;

/**
 * @author Diego Mancini
 */

public class Calculator {
    
    private String name;

    public Calculator(String name) {
        this.name = name;
    }


    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    /*@
        requires a >= b
    @*/
    public double multiply(double a, double b) {
        return a * b;
    }

    /*@
        requires b != 0
    @*/
    public double divide(double a, double b) {
        return a / b;
    }

    public double square(double a) {
        return a * a;
    }

    /*@
        requires a > 0
    @*/
    public double squareRoot(double a) {
        return Math.sqrt(a);
    }

    public void setName(/* @non_null @*/String name) {
        this.name = name;
    }
    
}
