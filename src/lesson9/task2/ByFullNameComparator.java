package lesson9.task2;

import java.util.Comparator;

/**
 * Created by Radion on 05.03.2017.
 */
public class ByFullNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student firstStudent, Student secondStudent) {
        return firstStudent.getFullName().compareTo(secondStudent.getFullName());
    }
}
