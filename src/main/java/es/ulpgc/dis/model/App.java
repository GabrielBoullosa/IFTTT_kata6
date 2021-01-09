package es.ulpgc.dis.model;

import es.ulpgc.dis.logger.LoggerFactory;
import es.ulpgc.dis.model.operator.IntegerRelationalOperator;
import es.ulpgc.dis.model.operator.Operator;
import es.ulpgc.dis.model.environment.Actuator;
import es.ulpgc.dis.model.environment.Alarm;
import es.ulpgc.dis.model.environment.RandomClock;
import es.ulpgc.dis.model.environment.Sensor;
import es.ulpgc.dis.model.system.Action;
import es.ulpgc.dis.model.system.Condition;
import es.ulpgc.dis.model.system.Rule;

public class App {
    public static void main( String[] args ){
        System.out.println("main start");

        Sensor randomClock = new RandomClock();
        Actuator alarm = new Alarm("despertar", 5);
        Sensor loggerRandomClock = LoggerFactory.getLoggerRandomClock(randomClock);

        Rule rule0 = new Rule(0, "regla cero", "encargada de activar la alarma");
        Condition conditionEqual = new Condition(loggerRandomClock,
                                                new Integer(46000),
                                                new IntegerRelationalOperator(Operator.EQUALS));

        Action actionON = new Action(alarm, true);

        rule0.addCondition(conditionEqual);
        rule0.addAction(actionON);

        /* while (true) rule0.execute(); */
        rule0.execute();
        rule0.execute();
        rule0.execute();

        System.out.println("main finish");
    }
}
