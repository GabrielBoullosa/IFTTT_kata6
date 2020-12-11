package es.ulpgc.dis;

public abstract class RelationalOperator {
    private Operator operator;

    public RelationalOperator(Operator operator) {
        this.operator = operator;
    }
    public boolean evaluate(Object leftObject, Object rightObject){
        boolean result;
        switch (operator){
            case EQUALS:
                result = equal(leftObject, rightObject);
                break;
            case NOT_EQUAL:
                result = not_equal(leftObject, rightObject);
                break;
            case GREATER_THAN:
                result = greater_than(leftObject, rightObject);
                break;
            case LESS_THAN:
                result = less_than(leftObject, rightObject);
                break;
            case GREATER_EQUAL_THAN:
                result = greater_equal_than(leftObject, rightObject);
                break;
            case LESS_EQUAL_THAN:
                result = less_equal_than(leftObject, rightObject);
                break;
            default:
                result = false;
        }
        return result;
    }

    protected abstract boolean equal(Object leftObject, Object rightObject);
    protected abstract boolean not_equal(Object leftObject, Object rightObject);
    protected abstract boolean greater_than(Object leftObject, Object rightObject);
    protected abstract boolean less_than(Object leftObject, Object rightObject);
    protected abstract boolean greater_equal_than(Object leftObject, Object rightObject);
    protected abstract boolean less_equal_than(Object leftObject, Object rightObject);

}
