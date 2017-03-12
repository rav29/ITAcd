package lesson10.task2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Radion on 11.03.2017.
 */
public class Garage {
    public static void main(String[] args) {
        Map<Car, Integer> garage = new HashMap<>();
        Bus scania = new Bus("Scania", "Touring", 2015, "White", 4, 230, 45);
        Bus maz = new Bus("Maz", "110", 2015, "Yellow", 4, 180, 80);
        Van Volkswagen = new Van("Volkswagen", "T1", 1966, "Red", 2, 44, 8);
        PassengerCar mercedes = new PassengerCar("Mercedes-Benz", "230 SL", 1963, "Sky blue", 2, 170, 200);
        Truck volvo = new Truck("Volvo", "FH", 2015, "Dark grey", 2, 250, 20);

        parkingIn(garage, scania);
        parkingIn(garage, scania);
        parkingIn(garage,maz);
        System.out.println("scania " + getNumberOfCars(garage,scania));
        System.out.println("maz " + getNumberOfCars(garage,maz));
        parkingIn(garage, mercedes);
        parkingOut(garage,mercedes);
        System.out.println("количество мерседесов: " + getNumberOfCars(garage, mercedes));
        System.out.println(scania.toString());

    }

    private static void parkingIn(Map<Car, Integer> garage, Car car) {
        Integer numberOfCars = 0;
        if (garage.containsKey(car)) {
            numberOfCars = garage.get(car);
            numberOfCars++;
            garage.put(car,numberOfCars);
        } else {
            numberOfCars = 1;
            garage.put(car, numberOfCars);
        }
    }

    private static void parkingOut(Map<Car, Integer> garage, Car car) {
        Integer numberOfCars = 0;
        if (garage.containsKey(car) && garage.get(car) > 0) {
            numberOfCars = garage.get(car);
            numberOfCars--;
            garage.put(car, numberOfCars);
        } else {
            System.out.println("Такого автомобиля в гараже нет");
        }
    }
    private static int getNumberOfCars(Map<Car, Integer> garage, Car car) {
        return garage.get(car);
    }

}
