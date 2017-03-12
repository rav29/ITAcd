package lesson10.task2;

/**
 * Created by Radion on 11.03.2017.
 */
public abstract class Car {
    private String manufacturer;
    private String model;
    private int yearOfProduction;
    private String color;
    private int numberOfWheelsDrive;
    private int numberOfHorsepower;


    public Car(String manufacturer, String model, int yearOfProduction, String color, int numberOfWheelsDrive, int numberOfHorsepower) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.color = color;
        this.numberOfWheelsDrive = numberOfWheelsDrive;
        this.numberOfHorsepower = numberOfHorsepower;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfWheelsDrive() {
        return numberOfWheelsDrive;
    }

    public int getNumberOfHorsepower() {
        return numberOfHorsepower;
    }

}
