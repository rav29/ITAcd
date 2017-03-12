package lesson10.task1;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by Radion on 09.03.2017.
 */
public class Task1 {
    public static void main(String[] args) {

        String[] words = new String("Can you imagine an imaginary menagerie manager imagining managing an imaginary menagerie").split(" ");
        Map<String, Integer> hashMap = new HashMap<>();
        Integer frequency = 1;
        for (int i = 0; i < words.length; i++) {
            if (hashMap.containsKey(words[i])) {
                frequency = hashMap.get(words[i]);
                frequency++;
            }
            hashMap.put(words[i],frequency);
        }
        System.out.println(hashMap);
    }
}
