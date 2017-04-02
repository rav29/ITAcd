package Factory;

import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by Radion on 25.03.2017.
 */
public class Scientist extends Thread {
    private Factory factory;
    private HashMap<String, Integer> stolenParts = new HashMap<>();
    private CyclicBarrier BARRIER;
    private String robotsParts[] = new String[] {"HEAD", "BODY", "LEFT_HAND", "RIGHT_HAND", "LEFT_LEG", "RIGHT_LEG", "CPU", "RAM", "HDD"};

    public Scientist(Factory factory, CyclicBarrier barrier) {
        this.factory = factory;
        this.BARRIER = barrier;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            try {
                System.out.println("Прислужник("+Thread.currentThread().getName() +"): жду ночи...");
                BARRIER.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("Прислужник("+Thread.currentThread().getName() +"): отправился за деталями");
            synchronized (factory) {
                getRobotsParts();
                System.out.println("Прислужник("+Thread.currentThread().getName() +"): возвращаюсь");
                if (i == 100) {
                    System.out.println("Хозяин прислужника-" + Thread.currentThread().getName()
                            + " собрал " + countNumberOfBuiltRobots() + " роботов!");
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public void getRobotsParts() {
        Random random = new Random();
        int j = random.nextInt(5);
        for (int i = 0; i <= j; i++) {
            int n = random.nextInt(9);
            if (factory.getHeap().isEmpty()) {
                System.out.println("Прислужник("+Thread.currentThread().getName() +"): на свалке пусто - возвращаюсь!");
                return;
            } else if (factory.getHeap().containsKey(robotsParts[n])) {
                factory.setNumberOfParts(robotsParts[n], factory.getHeap().get(robotsParts[n]) - 1);
                bringStolenParts(robotsParts[n]);
                if (factory.getHeap().get(robotsParts[n]) <= 0) {
                    factory.getHeap().remove(robotsParts[n]);
                }
            } else {
                i--;
            }
        }
    }



    public void bringStolenParts(String robotPart) {
        if (!(stolenParts.containsKey(robotPart))) {
            stolenParts.put(robotPart, 1);
        } else {
            this.stolenParts.put(robotPart, this.stolenParts.get(robotPart) + 1);
        }
    }

    public int countNumberOfBuiltRobots() {
        int minNumberOfParts = this.stolenParts.get(robotsParts[0]);
        int numberOfTypesOfParts = 0;
        for (HashMap.Entry<String, Integer> entry : this.stolenParts.entrySet()) {
            numberOfTypesOfParts++;
            minNumberOfParts = minNumberOfParts < entry.getValue() ? minNumberOfParts : entry.getValue();
        }
        if (numberOfTypesOfParts == 9) {
            return minNumberOfParts;

        } else {
            return 0;
        }

    }

    public HashMap<String, Integer> getStolenParts() {
        return stolenParts;
    }
}
