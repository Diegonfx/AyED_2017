package Cursada.TrabajosPracticos.TrabajoPractico3.ParkingSimulator;

/**
 * Created by DiegoMancini on 25/3/17.
 */
public class Car {

    private String plate;
    private String model;
    private String color;
    private String brand;

    public Car(String model, String color, String brand , String plate) {
        this.model = model;
        this.color = color;
        this.brand = brand;
        this.plate = plate;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


}
