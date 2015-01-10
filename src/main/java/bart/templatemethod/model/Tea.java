package bart.templatemethod.model;

/**
 */
public class Tea extends CaffeinatedBeverage {

    @Override
    public void brew() {
        logger.out("Placing teabag in hot water");
    }

    @Override
    public void addCondiments() {
        logger.out("Adding lemon");
    }
}
