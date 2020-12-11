package es.ulpgc.dis;

public class Action {
    private Actuator actuator;
    private Object threshold;

    public Action(Actuator actuator, Object threshold) {
        this.actuator = actuator;
        this.threshold = threshold;
    }

    public void actuate() {
        actuator.actuate(threshold);
    }
}
