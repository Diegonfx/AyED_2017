package Cursada.Clases.Clase5_LearningC;

/**
 * Created by DiegoMancini on 15/3/17.
 */
public class Parking {

    private Car[] carsParked;
    private int size;

    public Parking(int size) {
        carsParked = new Car[100];
        this.size = size;
    }

    public void parkCar(Car anyCar) {
        if (size == carsParked.length) {
            Car[] temporal = new Car[size * 2];
            for (int i = 0; i < carsParked.length; i++) {
                temporal[i] = carsParked[i];
            }
            carsParked = temporal;
        }
        carsParked[size] = anyCar;
        size++;
    }

    public int getCarSpot(Car anyCar) {
        int position = 0;
        for (int i = 0; i < carsParked.length; i++) {
            if (carsParked[i] == anyCar) {
                position = i;
            }
        }
        return position;
    }

    public boolean isCarParked(Car anyCar) {
        for (int i = 0; i < carsParked.length; i++) {
            if (carsParked[i] == anyCar) {
                return true;
            }
        } return false;
    }

    public void removeCar(int position) {
        carsParked[position] = null;
        for (int i = 0 ; i < carsParked.length ; i++) {
            carsParked[i] = carsParked[i+1];
            carsParked[i+1] = null;
        } size--;

    }

    public int getAmountOFCars() {
        int amount = 0;
        for (int i = 0 ; i < carsParked.length ; i++) {
            amount++;
        } return amount;
    }

    public boolean isEmpty() {
        for (int i = 0 ; i < carsParked.length ; i++) {
            if (carsParked[i] == null) {
                return true;
            }
        } return false;
    }

}
