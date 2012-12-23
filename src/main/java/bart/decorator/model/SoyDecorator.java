package bart.decorator.model;

/**
 */
public class SoyDecorator extends CondimentDecorator {

    private Beverage wrappedBeverage;

    public SoyDecorator(Beverage wrappedBeverage) {
        this.wrappedBeverage = wrappedBeverage;
    }

    @Override
    public String getDescription() {
        return "soy";
    }
    @Override
    public double cost() {
        return .25 + wrappedBeverage.cost();
    }
}
