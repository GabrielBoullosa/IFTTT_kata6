package es.ulpgc.dis.model.system;

import es.ulpgc.dis.RelationalOperator;
import es.ulpgc.dis.model.environment.Sensor;

public class Condition {
    private final Sensor sensor;
    private final Object threshold;
    private RelationalOperator relationalOperator;

    public Condition(Sensor sensor, Object threshold, RelationalOperator relationalOperator) {
        this.sensor = sensor;
        this.threshold = threshold;
        this.relationalOperator = relationalOperator;
    }

    public Condition(Sensor sensor, Object threshold) {
        this.sensor = sensor;
        this.threshold = threshold;
    }

    public boolean evaluate() {
        return relationalOperator.evaluate(threshold, sensor.getValue());
    }
}
