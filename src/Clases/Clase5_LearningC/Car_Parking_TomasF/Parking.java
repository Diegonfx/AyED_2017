package Clases.Clase5_LearningC.Car_Parking_TomasF;

public class Parking {

    private Car[] parking;
    private boolean[] spaceTaken;
    private int amountOfCarsParked;

    public Parking(int initialCapacity){
        parking = new Car[initialCapacity];
        spaceTaken = new boolean[initialCapacity];
        amountOfCarsParked = 0;
    }

    public void parkCar(Car car){
        if(amountOfCarsParked == parking.length){
            grow();
            parking[amountOfCarsParked] = car;
            spaceTaken[amountOfCarsParked] = true;
        }else{
            for(int i = 0;i< parking.length;i++){
                if(!spaceTaken[i]){
                    parking[i] = car;
                    spaceTaken[i] = true;
                    break;
                }
            }
        }
        amountOfCarsParked++;
    }

    public Car removeCar(int spot){
        if(spaceTaken[spot]){
            spaceTaken[spot] = false;
            Car result = parking[spot];
            amountOfCarsParked--;
            return result;
        }
        throw new RuntimeException("There is no Car in the requested spot");
    }

    public boolean isCarParked(Car car){
        return getCarSpot(car) != -1;
    }

    public int getCarSpot(Car car){
        if(isEmpty()) throw new RuntimeException("The parking is empty");
        for(int i = 0;i< amountOfCarsParked;i++){
            if(car.equals(parking[i])) return i;
        }
        return -1;
    }

    public boolean isEmpty(){
        return amountOfCarsParked == 0;
    }

    private void grow(){
        Car[] newParking = new Car[parking.length*2];
        boolean[] newSpaceTaken = new boolean[parking.length*2];
        for(int i = 0;i < parking.length;i++){
            newParking[i] = parking[i];
            newSpaceTaken[i] = spaceTaken[i];
        }
        parking = newParking;
        spaceTaken = newSpaceTaken;
    }

    public int getAmountOfCarsParked() {
        return amountOfCarsParked;
    }
}
