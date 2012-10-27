package bart.strategy.model;

import bart.strategy.behavior.FlyRegular;

/**
 *
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        setFlyBehavior(new FlyRegular());
    }

    @Override
    public void display() {
        System.out.println("I look like a Mallard");
    }
}
