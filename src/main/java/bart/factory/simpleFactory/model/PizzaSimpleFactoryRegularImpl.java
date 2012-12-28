package bart.factory.simpleFactory.model;

/**
 *
 */
public class PizzaSimpleFactoryRegularImpl implements PizzaSimpleFactory {

    @Override
    public Pizza createPizza(PizzaType type) {
        if (type.equals(PizzaType.CHEESE)) {
            return new CheesePizza();
        }
        else if (type.equals(PizzaType.PEPPERONI)) {
            return new PepperoniPizza();
        }
        else throw new IllegalArgumentException("Invalid type of pizza requested");
    }
}
