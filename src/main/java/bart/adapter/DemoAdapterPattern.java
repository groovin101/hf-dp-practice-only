package bart.adapter;

import bart.Dox;
import bart.adapter.model.AdapterForEnumerationAsIterator;
import bart.adapter.model.AdapterForTurkeyAsDuck;
import hf.adapter.ducks.Duck;
import hf.adapter.ducks.MallardDuck;
import hf.adapter.ducks.WildTurkey;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

/**
 * Demonstrate how to adapt an existing class to something that expects a different kind of interface. This is akin to
 * putting a 2 pronged adapter onto a grounded cord - we adapt the interface to fit.
 */
public class DemoAdapterPattern {

    private static Dox print = new Dox();

    public static void main(String[] args) {
        showHowATurkeyCanStandInPlaceOfADuck();
        showUsAdaptingAnEnumeratorAndMaskingAsAnIterator();
    }

    /**
     * Our adapter uses composition to pass along requests to the underlying adaptee (the wild turkey impl). Also note that
     * our adapter itself expects a Turkey interface, so we might have different kinds of Turkeys that can also leverage the
     * adapter down the road.
     */
    private static void showHowATurkeyCanStandInPlaceOfADuck() {

        print.printTestTitle("A duck first, then a turkey in duck costume next");
        List<Duck> ducks = new ArrayList<>();
        ducks.add(new MallardDuck());
        ducks.add(new AdapterForTurkeyAsDuck(new WildTurkey()));
        pokeTheDucks(ducks);
    }

    private static void showUsAdaptingAnEnumeratorAndMaskingAsAnIterator() {

        print.printTestTitle("Now we iterate over the elements in a legacy vector using an adapter rather than using the native enumeration object");

        Vector <String> legacyCollection = new Vector<>();
        legacyCollection.add("one");
        legacyCollection.add("two");
        legacyCollection.add("infinity and beyond");

        Enumeration<String> enumeration = legacyCollection.elements();

        AdapterForEnumerationAsIterator enumerationAsIterator = new AdapterForEnumerationAsIterator(enumeration);

        while (enumerationAsIterator.hasNext()) {
            print.out((String) enumerationAsIterator.next());
        }
    }

    private static void pokeTheDucks(List<Duck> ducks) {
        for (Duck duck : ducks) {
            print.out("Duck interface impl: " + duck.getClass().getCanonicalName());
            duck.quack();
            duck.fly();
        }
    }
}
