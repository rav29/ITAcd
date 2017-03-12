package lesson9.task1;

import java.util.*;

/**
 * Created by Radion on 04.03.2017.
 */
public class task1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("12345");
        list.add("1234");
        list.add("123");
        list.add("321");
        list.add("1234");
        list.add("321");
        list.add("1234");
        list.add("321");

        markLength4(list);
        System.out.println(list);
    }

    static void markLength4(List<String> list) {

        for (int i = 0; list.size() > i; i++) {
            if (list.get(i).length() == 4) {
                list.add(i, "****");
                i++;
            }
        }

    }

}
