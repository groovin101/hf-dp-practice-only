package bart.factory.simpleFactory.model;

/**
 *
 */
public class PizzaSimpleFactoryChicagoStyleImpl implements PizzaSimpleFactory {

    @Override
    public Pizza createPizza(PizzaType type) {
        if (type.equals(PizzaType.CHEESE)) {
            return new ChicagoCheesePizza();
        }
        else if (type.equals(PizzaType.PEPPERONI)) {
            return new ChicagoPepperoniPizza();
        }
        else throw new IllegalArgumentException("Invalid type of pizza requested");
    }
}
