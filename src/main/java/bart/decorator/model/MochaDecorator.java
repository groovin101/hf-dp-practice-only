package bart.decorator.model;

/**
 */
public class MochaDecorator extends CondimentDecorator {

    private Beverage wrappedBeverage;

    public MochaDecorator(Beverage wrappedBeverage) {
        this.wrappedBeverage = wrappedBeverage;
    }

    @Override
    public String getDescription() {
        return "mocha";
    }

    @Override
    public double cost() {
        return .49 + wrappedBeverage.cost();
    }
}
