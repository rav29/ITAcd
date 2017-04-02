package Factory;

import java.util.concurrent.CyclicBarrier;

/**
 * Created by Radion on 25.03.2017.
 */
public class Main {
    private static int nightsCounter = 0;
    private static final CyclicBarrier BARRIER = new CyclicBarrier(3, ()-> {
        System.out.println("And the BARRIER said: let there be the "+ nightsCounter + " NIGHT ");
        nightsCounter++;
    });

    public static void main(String[] args) {
        Factory factory = new Factory(BARRIER);
        Scientist scientistOne = new Scientist(factory,BARRIER);
        Scientist scientistTwo = new Scientist(factory,BARRIER);

        factory.start();
        scientistOne.start();
        scientistTwo.start();

        try {
            factory.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            scientistOne.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            scientistTwo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
