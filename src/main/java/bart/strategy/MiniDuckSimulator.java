package bart.strategy;

import bart.strategy.behavior.FlyWithARocket;

import java.util.ArrayList;
import java.util.List;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        List<Duck> allDucks = initDucks();
        for (Duck duck : allDucks) {
            System.out.println("------------------------");
            duck.display();
            duck.fly();
            if (duck.getClass().getSimpleName().equals("WoodenDuck")) {
                System.out.println("To demonstrate runtime behavior change, let's strap a rocket to the wooden duck.");
                duck.setFlyBehavior(new FlyWithARocket());
                duck.fly();
            }
            duck.quack();
            duck.swim();
            System.out.println("------------------------");
        }
    }

    private static List<Duck> initDucks() {
        List<Duck> ducks = new ArrayList<Duck>();
        MallardDuck mallard = new MallardDuck();
        RedheadDuck redheadDuck = new RedheadDuck();
        WoodenDuck woodenDuck = new WoodenDuck();
        ducks.add(mallard);
        ducks.add(redheadDuck);
        ducks.add(woodenDuck);
        return ducks;
    }
}

