package bart.strategy.model;

import bart.strategy.behavior.FlyNoWay;

/**
 *
 */
public class WoodenDuck extends Duck {

    public WoodenDuck() {
        setFlyBehavior(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("Yo, I'm just a decoy made of wood!");
    }
}
