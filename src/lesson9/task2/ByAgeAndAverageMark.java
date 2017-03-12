package lesson9.task2;

import java.util.Comparator;

/**
 * Created by Radion on 05.03.2017.
 */
public class ByAgeAndAverageMark implements Comparator<Student> {
    @Override
    public int compare(Student firstStudent, Student secondStudent) {
        if (firstStudent.getAge() == secondStudent.getAge()) {
             return new Double(firstStudent.getAverageMark()).compareTo(secondStudent.getAverageMark());
        }
        return new Integer(firstStudent.getAge()).compareTo(secondStudent.getAge());
    }
}
