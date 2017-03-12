package lesson10.task2;

/**
 * Created by Radion on 11.03.2017.
 */
public class PassengerCar extends Car{
    private int speedLimit;

    public PassengerCar(String manufacturer, String model, int yearOfProduction, String color, int numberOfWheelsDrive,int numberOfHorsepower, int speedLimit) {
        super(manufacturer, model, yearOfProduction, color, numberOfWheelsDrive, numberOfHorsepower);
        this.speedLimit = speedLimit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PassengerCar)) return false;
        PassengerCar passengerCar = (PassengerCar) o;
        return getManufacturer().equals(passengerCar.getManufacturer()) && getModel().equals(passengerCar.getModel()) && getYearOfProduction() == passengerCar.getYearOfProduction() && getColor().equals(passengerCar.getColor())  && getNumberOfWheelsDrive() == passengerCar.getNumberOfWheelsDrive() && getNumberOfHorsepower() == passengerCar.getNumberOfHorsepower() && speedLimit == passengerCar.speedLimit;
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
        result = prime * result + speedLimit;
        return result;
    }
    @Override
    public String toString() {
        return "PassengerCar{" + " Manufacturer= " + getManufacturer() + "; Model= " + getModel() + "; Year Of Production= " + getYearOfProduction() + "; Color= " + getColor() + "; Number Of Wheels Drive= " + getNumberOfWheelsDrive() + "; Number Of Horsepower= " + getNumberOfHorsepower() +  "; speed Limit=" + speedLimit + ";}";
    }
}
