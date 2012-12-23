package bart.decorator.model;

/**
 */
public class Espresso extends Beverage {

    public double cost() {
        return super.cost(1.99);
    }
}
