package bart.strategy.behavior;

/**
 *
 */
public class FlyWithARocket implements FlyBehavior {
    public String flyString(String duckIdentificationString) {
        return duckIdentificationString + "I'm flying with a rocket strapped to my back now. Weeeeeeeeee!";
    }
}
