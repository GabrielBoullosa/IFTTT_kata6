package es.ulpgc.dis.logger;

import es.ulpgc.dis.model.environment.RandomClock;
import es.ulpgc.dis.model.environment.Sensor;

public class LoggerFactory {
    public static Sensor getLoggerRandomClock(Object randomClock){
        return (Sensor) java.lang.reflect.Proxy.newProxyInstance(randomClock.getClass().getClassLoader(),
                                                                new Class[] {Sensor.class},
                                                                new LoggerRandomClock((RandomClock) randomClock));
    }
}
