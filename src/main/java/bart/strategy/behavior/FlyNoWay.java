package bart.strategy.behavior;

/**
 *
 */
public class FlyNoWay implements FlyBehavior {
    public String flyString(String duckIdentificationString) {
        return duckIdentificationString + "not flying! I can't dorkus!";
    }
}
