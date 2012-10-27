package bart.strategy.behavior;

/**
 *
 */
public class FlyRegular implements FlyBehavior {

    public String flyString(String duckIdentificationString) {
        return duckIdentificationString + "I'm flying";
    }
}
