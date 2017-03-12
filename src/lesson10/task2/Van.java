package lesson10.task2;

/**
 * Created by Radion on 11.03.2017.
 */
public class Van extends Car {
    private int numberOfSeats;

    public Van(String manufacturer, String model, int yearOfProduction, String color, int numberOfWheelsDrive,int numberOfHorsepower, int numberOfSeats) {
        super(manufacturer, model, yearOfProduction, color, numberOfWheelsDrive, numberOfHorsepower);
        this.numberOfSeats = numberOfSeats;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Van)) return false;
        Van van = (Van) o;
        return getManufacturer().equals(van.getManufacturer()) && getModel().equals(van.getModel()) && getYearOfProduction() == van.getYearOfProduction() && getColor().equals(van.getColor())  && getNumberOfWheelsDrive() == van.getNumberOfWheelsDrive() && getNumberOfHorsepower() == van.getNumberOfHorsepower() && numberOfSeats == van.numberOfSeats;
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
        result = prime * result + numberOfSeats;
        return result;
    }
    @Override
    public String toString() {
        return "Van{" + " Manufacturer= " + getManufacturer() + "; Model= " + getModel() + "; Year Of Production= " + getYearOfProduction() + "; Color= " + getColor() + "; Number Of Wheels Drive= " + getNumberOfWheelsDrive() + "; Number Of Horsepower= " + getNumberOfHorsepower() +  "; number Of Seats=" + numberOfSeats + ";}";
    }

}
