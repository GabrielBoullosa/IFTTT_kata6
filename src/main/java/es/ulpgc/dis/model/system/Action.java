package es.ulpgc.dis.model.system;

import es.ulpgc.dis.model.environment.Actuator;

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
