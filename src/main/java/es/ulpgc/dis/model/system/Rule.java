package es.ulpgc.dis.model.system;

import java.util.ArrayList;
import java.util.List;

public class Rule {
    private final Integer ID;
    private final String name;
    private final String description;

    private List<Condition> conditions = new ArrayList<Condition>();
    private List<Action> actions = new ArrayList<Action>();

    public Rule(Integer ID, String name, String description) {
        this.ID = ID;
        this.name = name;
        this.description = description;
    }

    public void addCondition(Condition condition){
        conditions.add(condition);
    }
    public void addAction(Action action){
        actions.add(action);
    }

    public void execute(){
        if (isTrueAllConditions())
            actAllActions();
    }

    private boolean isTrueAllConditions() {
        boolean result = true;
        for (Condition condition : conditions) {
            if (!condition.evaluate())
                result = false;
        }
        return result;
    }

    private void actAllActions() {
        for (Action action : actions)
            action.actuate();
    }
}
