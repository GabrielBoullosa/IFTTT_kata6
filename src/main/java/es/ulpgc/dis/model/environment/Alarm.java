package es.ulpgc.dis.model.environment;

public class Alarm implements Actuator {

    private final String name;
    private Integer volume;

    private boolean status;

    public Alarm(String name, Integer volume) {
        this.name = name;
        this.volume = volume;
    }

    public void actuate(Object status) {
        if (status instanceof Boolean)
            this.status = (Boolean) status;
    }
}
