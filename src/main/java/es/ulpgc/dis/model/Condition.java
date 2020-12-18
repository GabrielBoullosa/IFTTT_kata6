package es.ulpgc.dis.model;

import es.ulpgc.dis.RelationalOperator;
import es.ulpgc.dis.Sensor;

public class Condition {
    private final Sensor sensor;
    private final Object threshold;
    private RelationalOperator relationalOperator;

    public Condition(Sensor sensor, Object threshold) {
        this.sensor = sensor;
        this.threshold = threshold;
    }

    public boolean evaluate() {
        return relationalOperator.evaluate(threshold, sensor.getValue());
    }
}
