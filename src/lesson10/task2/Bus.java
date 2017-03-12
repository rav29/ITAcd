package lesson10.task2;

import java.util.Objects;

/**
 * Created by Radion on 11.03.2017.
 */
public class Bus extends Car {
    private int maxNumberOfPassengers;

    public Bus(String manufacturer, String model, int yearOfProduction, String color, int numberOfWheelsDrive, int numberOfHorsepower, int maxNumberOfPassengers) {
        super(manufacturer, model, yearOfProduction, color, numberOfWheelsDrive, numberOfHorsepower);
        this.maxNumberOfPassengers = maxNumberOfPassengers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bus)) return false;
        Bus bus = (Bus) o;
        return getManufacturer().equals(bus.getManufacturer()) && getModel().equals(bus.getModel()) && getYearOfProduction() == bus.getYearOfProduction() && getColor().equals(bus.getColor())  && getNumberOfWheelsDrive() == bus.getNumberOfWheelsDrive() && getNumberOfHorsepower() == bus.getNumberOfHorsepower() && maxNumberOfPassengers == bus.maxNumberOfPassengers;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + getManufacturer().length();
        result = prime * result + getModel().length();
        result = prime * result + getYearOfProduction();
        result = prime * result + getColor().length();
        result = prime * result + getNumberOfWheelsDrive();
        result = prime * result + getNumberOfHorsepower();
        result = prime * result + maxNumberOfPassengers;
        return result;
    }

    @Override
    public String toString() {
        return "Bus{" + " Manufacturer= " + getManufacturer() + "; Model= " + getModel() + "; Year Of Production= " + getYearOfProduction() + "; Color= " + getColor() + "; Number Of Wheels Drive= " + getNumberOfWheelsDrive() + "; Number Of Horsepower= " + getNumberOfHorsepower() +  "; maxNumberOfPassengers=" + maxNumberOfPassengers + ";}";
    }

}

