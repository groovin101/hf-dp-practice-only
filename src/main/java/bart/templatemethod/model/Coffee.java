package bart.templatemethod.model;

/**
 */
public class Coffee extends CaffeinatedBeverage {

    @Override
    public void brew() {
        logger.out("Adding coffee grounds to hot water");
    }

    @Override
    public void addCondiments() {
        logger.out("Adding cream and sugar");
    }
}