package es.ulpgc.dis;

public class Condition {
    private final Sensor sensor;
    private final Object threshold;
    private RelationalOperator relationalOperator;

    public Condition(Sensor sensor, Object threshold) {
        this.sensor = sensor;
        this.threshold = threshold;
    }

    public boolean evaluate() {
        return false;
    }
}
