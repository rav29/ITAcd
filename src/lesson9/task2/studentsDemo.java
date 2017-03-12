package lesson9.task2;

import java.util.*;


/**
 * Created by Radion on 04.03.2017.
 */
public class studentsDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Ivan", "Petrenko", 13, 7.5));
        students.add(new Student("Angus", "Young", 13, 6.66));
        students.add(new Student("John", "Johnson", 12, 8.8));
        students.add(new Student("Will", "Hunting", 12, 9.9));

        System.out.println(highestAverageMark(students).getFullName()); //вывод ученика с наивысшим средним баллом

        printSortedByAgeAndAverageMark(students);   //сортировка  и вывод по среднему баллу и возарсту
        printSortedByFullName(students);            //сортировка и вывод по полному имени
    }

    static Student highestAverageMark (List<Student> list) {
        ListIterator<Student> iterator = list.listIterator();
        Student studentWithMaxAverageMark = list.get(0);
        Student nextstudent = list.get(0);
        while (iterator.hasNext()) {
            nextstudent = iterator.next();
            if (nextstudent.getAverageMark()>studentWithMaxAverageMark.getAverageMark()) {
                studentWithMaxAverageMark = nextstudent;
            }
        }
        return studentWithMaxAverageMark;
    }

    public static void printSortedByFullName(List<Student> students) {
        Collections.sort(students, new ByFullNameComparator());
        for (Student student: students) {
            System.out.println(student.getFullName());
        }
    }

    public static void printSortedByAgeAndAverageMark(List<Student> students) {
        Collections.sort(students, new ByAgeAndAverageMark());
        for (Student student: students) {
            System.out.println(student.getFullName() + " " + student.getAge() + " " + student.getAverageMark());
        }
    }
}
