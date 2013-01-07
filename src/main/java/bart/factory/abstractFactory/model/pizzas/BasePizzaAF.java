package bart.factory.abstractFactory.model.pizzas;

import bart.factory.abstractFactory.model.ingredients.Cheese;
import bart.factory.abstractFactory.model.ingredients.Dough;
import bart.factory.abstractFactory.model.ingredients.Pepperoni;
import bart.factory.abstractFactory.model.ingredients.Sauce;
import bart.factory.simpleFactory.model.Pizza;

/**
 */
public abstract class BasePizzaAF implements Pizza {

    Cheese cheese;
    Dough dough;
    Sauce sauce;
    Pepperoni pepperoni;

    public abstract String getDescription();

    public abstract void prepare();

    public void bake() {
        System.out.println("Baking a " + getDescription());
    }
    public void cut() {
        System.out.println("Cutting a " + getDescription());
    }
    public void box() {
        System.out.println("Boxing a " + getDescription());
    }
}
