package es.ulpgc.dis.logger;

import es.ulpgc.dis.model.environment.RandomClock;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggerRandomClock implements InvocationHandler {
    private RandomClock randomClock;

    public LoggerRandomClock(RandomClock randomClock) {
        this.randomClock = randomClock;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Integer resultSensor = (Integer) method.invoke(randomClock, args);

        System.out.println("La llamada a RandomClock [resultSensor = "+ resultSensor + "]");

        return resultSensor;
    }
}
