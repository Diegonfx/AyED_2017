package Cursada.TrabajosPracticos.TrabajoPractico3.ParkingSimulator;

/**
 * Created by DiegoMancini on 25/3/17.
 */
public class PSTester {

    public static void main(String[] args) {
        ParkingSimulator parking = new ParkingSimulator();
        Car carNumber0 = new Car("Civic" , "Black" , "Honda" , "AA1");
        Car carNumber1 = new Car("Civic" , "Black" , "Honda" , "AB2");
        Car carNumber2 = new Car("Civic" , "Black" , "Honda" , "AC3");
        Car carNumber3 = new Car("Civic" , "Black" , "Honda" , "AD4");
        Car carNumber4 = new Car("Civic" , "Black" , "Honda" , "AE5");
        Car carNumber5 = new Car("Civic" , "Black" , "Honda" , "AF6");
        Car carNumber6 = new Car("Civic" , "Black" , "Honda" , "AG7");
        Car carNumber7 = new Car("Civic" , "Black" , "Honda" , "AH8");
        Car carNumber8 = new Car("Civic" , "Black" , "Honda" , "AI9");
        Car carNumber9 = new Car("Civic" , "Black" , "Honda" , "AJ10");
        Car carNumber10 = new Car("Civic" , "Black" , "Honda", "AK11");
        Car carNumber11 = new Car("Civic" , "Black" , "Honda", "AL12");
        Car carNumber12 = new Car("Civic" , "Black" , "Honda", "AM13");
        Car carNumber13 = new Car("Civic" , "Black" , "Honda", "AN14");
        Car carNumber14 = new Car("Civic" , "Black" , "Honda", "AO15");

        parking.parkCar(carNumber0);
        parking.parkCar(carNumber1);
        parking.parkCar(carNumber2);
        parking.parkCar(carNumber3);
        parking.parkCar(carNumber4);
        parking.parkCar(carNumber5);
        parking.parkCar(carNumber6);
        parking.parkCar(carNumber7);
        parking.parkCar(carNumber8);
        parking.parkCar(carNumber9);
        parking.parkCar(carNumber10);
        parking.parkCar(carNumber11);
        parking.parkCar(carNumber12);
        parking.parkCar(carNumber13);
        parking.parkCar(carNumber14);
        parking.printParking();

        parking.removeFromGarage(10);
        parking.removeFromGarage(5);

        parking.printParking();

        parking.getMoneyAtTheEndOfTheDay();
    }

}
