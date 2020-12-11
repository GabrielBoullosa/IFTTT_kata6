package es.ulpgc.dis;

public class IntegerRelationalOperator extends RelationalOperator{

    public IntegerRelationalOperator(Operator operator) {
        super(operator);
    }

    protected boolean equal(Object leftObject, Object rightObject) {
        return ((Integer) leftObject) == ((Integer) rightObject);
    }

    protected boolean not_equal(Object leftObject, Object rightObject) {
        return ((Integer) leftObject) != ((Integer) rightObject);
    }

    protected boolean greater_than(Object leftObject, Object rightObject) {
        return ((Integer) leftObject) > ((Integer) rightObject);
    }

    protected boolean less_than(Object leftObject, Object rightObject) {
        return ((Integer) leftObject) < ((Integer) rightObject);
    }

    protected boolean greater_equal_than(Object leftObject, Object rightObject) {
        return ((Integer) leftObject) >= ((Integer) rightObject);
    }

    protected boolean less_equal_than(Object leftObject, Object rightObject) {
        return ((Integer) leftObject) <= ((Integer) rightObject);
    }
}
