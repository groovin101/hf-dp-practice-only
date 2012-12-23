package bart.decorator.model;

import java.util.ArrayList;
import java.util.List;

/**
 */
public abstract class Beverage {

    private String description;
    private List<Condiment> condiments;

    public Beverage() {
        condiments = new ArrayList<Condiment>();
    }

    public String getDescription() {
        return description;
    }

    public double cost(double baseCost) {

        for (Condiment condiment : condiments) {
            baseCost += condiment.cost();
        }
        return baseCost;
    }

    public void addCondiment(Condiment condiment) {
        condiments.add(condiment);
    }

}
