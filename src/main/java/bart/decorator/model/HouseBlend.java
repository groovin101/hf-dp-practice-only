package bart.decorator.model;

/**
 */
public class HouseBlend extends Beverage {


    public HouseBlend() {
    }

    public double cost() {
        return super.cost(.99);
    }

}
