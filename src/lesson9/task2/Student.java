package lesson9.task2;

/**
 * Created by Radion on 05.03.2017.
 */
public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private double averageMark;

    public Student (String firstName, String lastName, int age, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.averageMark = averageMark;

    }

    public double getAverageMark() {
        return averageMark;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getAge() {
        return age;
    }
}
