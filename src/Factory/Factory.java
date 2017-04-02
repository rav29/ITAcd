package Factory;

import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by Radion on 26.03.2017.
 */
public class Factory extends Thread {

    private HashMap<String, Integer> heap = new HashMap<>();
    private CyclicBarrier BARRIER;
    private String robotsParts[] = new String[] {"HEAD", "BODY", "LEFT_HAND", "RIGHT_HAND", "LEFT_LEG", "RIGHT_LEG", "CPU", "RAM", "HDD"};


    @Override
    public void run() {
        for (int i = 0; i <=100 ; i++) {
            try {
                System.out.println("Фабрика: жду ночи...");
                BARRIER.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            if (i == 0) {
                System.out.println("Фабрика: заполняю 20-ю деталями...");
                first20ToHeap();
                System.out.println(heap);
            }
            addRobotsPartsToHeap();
            System.out.println("Фабрика: добавлено несколько деталей");
            try {
                Thread.sleep(100);
                System.out.println("Фабрика: скоро рассвет...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public Factory (CyclicBarrier barrier) {
        this.BARRIER = barrier;
    }

    public synchronized HashMap<String, Integer> getHeap() {
        return heap;
    }

    public synchronized  void setNumberOfParts(String key , Integer value) {
        this.heap.put(key,value);
    }

    public synchronized void addRobotsPartsToHeap () {
        Random random = new Random();
        int j = random.nextInt(5);
        for (int i = 0; i <= j ; i++) {
            int n = random.nextInt(9);
            if (!(heap.containsKey(robotsParts[n]))) {
                heap.put(robotsParts[n], 1);
            } else {
                int numberOfParts = heap.get(robotsParts[n]);
                heap.put(robotsParts[n], numberOfParts + 1);
            }
        }
    }

    public synchronized void first20ToHeap () {
        Random random = new Random();
        for (int i = 0; i < 20 ; i++) {
            int n = random.nextInt(9);
            if (!(heap.containsKey(robotsParts[n]))) {
                heap.put(robotsParts[n], 1);
            } else {
                int numberOfParts = heap.get(robotsParts[n]);
                heap.put(robotsParts[n], numberOfParts + 1);
            }
        }
    }
}
