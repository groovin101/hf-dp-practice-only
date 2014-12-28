package bart.facade;

import bart.Dox;
import hf.facade.hometheater.*;

/**
 * @see FacadeForMovieWatching
 */
public class DemoFacadePattern {

    private static Dox print = new Dox();
    private static FacadeForMovieWatching facade;

    public static void main(String[] args) {
        init();
        turnAllTheContraptionsOnThroughTheFacade();
        turnEverythingOffThroughTheFacade();
    }

    private static void init() {
        Amplifier theAmp = new Amplifier("The amp");
        facade = new FacadeForMovieWatching(theAmp, new DvdPlayer("Dvd playa", theAmp),
                new PopcornPopper("Best damn popcorn popper in town"), new TheaterLights("Magic lights"),
                new Screen("Fancy view screen"));
    }

    private static void turnAllTheContraptionsOnThroughTheFacade() {

        print.printTestTitle("Rather than doing everything ourselves, leverage our facade to work with all of these" +
                " interfaces for us");
        facade.watchMovie("fear and loathing");
    }

    private static void turnEverythingOffThroughTheFacade() {
        print.printTestTitle("Have the facade press all of the buttons for us so that we don't have to manually dink with each interface");
        facade.shutItAllDown();
    }
}
