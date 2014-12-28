package bart.adapter.model;

import hf.adapter.ducks.Duck;
import hf.adapter.ducks.Turkey;

/**
 * Construct the adapter with the object that it's adapting
 */
public class AdapterForTurkeyAsDuck implements Duck {

    private Turkey turkeyThatMasqueradesInDuckCostume;

    public AdapterForTurkeyAsDuck(Turkey turkey) {
        turkeyThatMasqueradesInDuckCostume = turkey;
    }

    @Override
    public void quack() {
        turkeyThatMasqueradesInDuckCostume.gobble();
    }

    @Override
    public void fly() {
        //cant fly so well, so flap like crazy and simulate a duck you turkey!
        for (int i=0; i<5; i++) {
            turkeyThatMasqueradesInDuckCostume.fly();
        }
    }
}
