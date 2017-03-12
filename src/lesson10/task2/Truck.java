package lesson10.task2;

/**
 * Created by Radion on 11.03.2017.
 */
public class Truck extends Car {
    private int maxWeightOfCargo;

    public Truck(String manufacturer, String model, int yearOfProduction, String color, int numberOfWheelsDrive, int numberOfHorsepower, int maxWeightOfCargo) {
        super(manufacturer, model, yearOfProduction, color, numberOfWheelsDrive, numberOfHorsepower);
        this.maxWeightOfCargo = maxWeightOfCargo;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Truck)) return false;
        Truck truck = (Truck) o;
        return getManufacturer().equals(truck.getManufacturer()) && getModel().equals(truck.getModel()) && getYearOfProduction() == truck.getYearOfProduction() && getColor().equals(truck.getColor())  && getNumberOfWheelsDrive() == truck.getNumberOfWheelsDrive() && getNumberOfHorsepower() == truck.getNumberOfHorsepower() && maxWeightOfCargo == truck.maxWeightOfCargo;
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
        result = prime * result + maxWeightOfCargo;
        return result;
    }
    @Override
    public String toString() {
        return "Truck{" + " Manufacturer= " + getManufacturer() + "; Model= " + getModel() + "; Year Of Production= " + getYearOfProduction() + "; Color= " + getColor() + "; Number Of Wheels Drive= " + getNumberOfWheelsDrive() + "; Number Of Horsepower= " + getNumberOfHorsepower() +  "; max Weight Of Cargo=" + maxWeightOfCargo + ";}";
    }
    
}
