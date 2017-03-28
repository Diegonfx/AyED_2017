package Cursada.TrabajosPracticos.TrabajoPractico3.ParkingSimulator;

import Cursada.TrabajosPracticos.TrabajoPractico3.Stacks.DynamicStack.DynamicStack;
import Cursada.TrabajosPracticos.TrabajoPractico3.Stacks.StaticStack.StaticStack;

/**
 * Created by DiegoMancini on 24/3/17.
 */
public class ParkingSimulator {

    private StaticStack<Car> carsParked;
    private int amountOfMoney;
    private DynamicStack<Car> street;

    public ParkingSimulator() {
        carsParked = new StaticStack<>(51);
        street = new DynamicStack<>();
        amountOfMoney = 0;
    }

    public void parkCar(Car anyCar) {
        if (carsParked.size() <= 50) {
            carsParked.push(anyCar);
            amountOfMoney += 5;
        } else {
            throw new RuntimeException("Parking is full");
        }
    }

    public void removeFromGarage(int positionOfCar) {
        for (int i = carsParked.size() ; i >= positionOfCar; i--) {
            if (i != positionOfCar) {
                street.push(( (Car)carsParked.peek()));
                carsParked.pop();
            } else {
                carsParked.pop();
            }
        }
        for (int i = street.size() ; i > 0 ; i--)   {
            carsParked.push(((Car)street.peek()));
            street.pop();
        }
    }

    public void getMoneyAtTheEndOfTheDay() {
        System.out.println("Amount of money is: " + getAmountOfMoney());
    }

    public void printParking() {
        System.out.println("Amount of cars in parking: " + carsParked.size() + "\n");
        System.out.println(carsParked.peek());
    }

    public StaticStack<Car> getCarsParked() {
        return carsParked;
    }
    public Car getCarParked() {
        Car nuevoCar =(Car) carsParked.peek();
        return nuevoCar;
    }
    public int getAmountOfMoney() {
        return amountOfMoney;
    }

}
