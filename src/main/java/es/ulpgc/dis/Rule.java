package es.ulpgc.dis;

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
}
