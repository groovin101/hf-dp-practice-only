package bart.strategy.model;

import bart.strategy.behavior.FlyRegular;

/**
 *
 */
public class RedheadDuck extends Duck {

    public RedheadDuck() {
        setFlyBehavior(new FlyRegular());
    }

    @Override
    public void display() {
        System.out.println("I look like a Readhead Duck!");
    }
}
