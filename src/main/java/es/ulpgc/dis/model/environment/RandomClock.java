package es.ulpgc.dis.model.environment;

import java.util.Random;

public class RandomClock implements Sensor{

    private final Random random;

    public RandomClock() {
        this.random = new Random(System.currentTimeMillis());
    }

    public Object getValue() {
        return new Integer(random.nextInt(86400));
    }
}
