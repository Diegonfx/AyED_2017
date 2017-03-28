package Cursada.Clases.Clase5_LearningC;

/**
 * Created by DiegoMancini on 15/3/17.
 */
public class Car {

    private String licensePLate;
    private String model;
    private String color;

    public Car(String licensePLate, String model, String color) {
        this.licensePLate = licensePLate;
        this.model = model;
        this.color = color;
    }

    public String getLicensePLate() {
        return licensePLate;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setLicensePLate(String licensePLate) {
        this.licensePLate = licensePLate;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
