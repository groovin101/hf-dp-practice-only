package bart.factory.factoryMethod.model;

import bart.factory.simpleFactory.model.BasePizza;

/**
 */
public class ChicagoCheesePizzaUsingMoldyRottenCheese extends BasePizza {

    @Override
    public String getDescription() {
        return "Chicago style cheese pizza that has gone very wrong, using moldy, rotten cheese (franchise killer!)";
    }
}
