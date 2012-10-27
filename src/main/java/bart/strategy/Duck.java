package bart.strategy;

import bart.strategy.behavior.FlyBehavior;

/**
 *
 */
public abstract class Duck {

    private FlyBehavior flyBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public String getName() {
        return this.getClass().getSimpleName();
    }

    public String getBehaviorPrefix() {
        return "Look, I'm a " + getName() + " and I'm ";
    }

    public void fly() {
        System.out.println(flyBehavior.flyString(getBehaviorPrefix()));
    }

    public void quack() {
        System.out.println(getBehaviorPrefix() + "quacking!");
    }

    public void swim() {
        System.out.println(getBehaviorPrefix() + "swimming!");
    }

    public abstract void display();
}