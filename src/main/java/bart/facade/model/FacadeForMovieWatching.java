package bart.facade.model;

import hf.facade.hometheater.*;

/**
 * The intent of this Facade is to provide a simple interface to clients. It is NOT to encapsulate the underlying
 * subsystem, as we want to give clients full access to the granularity underneath if they so choose to use it.
 *
 * This facade has some smarts, in that it knows in which order things need to happen, but overall it is very light on
 * logic. We are using the subsystem as another client might, but we are sparing other clients the details of having to
 * manage all of this complexity.
 *
 * Another benefit that could be realized by using a facade is indeed re-usability. Assuming a client only accesses
 * functional of the subsystem through our interface, they could be shielded from future subsystem implementation
 * changes.
 */
public class FacadeForMovieWatching {

    private Amplifier amplifier;
    private DvdPlayer dvdPlayer;
    private PopcornPopper popcornPopper;
    private TheaterLights theaterLights;
    private Screen screen;

    public FacadeForMovieWatching(Amplifier amplifier, DvdPlayer dvdPlayer, PopcornPopper popcornPopper, TheaterLights theaterLights, Screen screen) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.popcornPopper = popcornPopper;
        this.theaterLights = theaterLights;
        this.screen = screen;
    }

    public void watchMovie(String movieTitle) {

        popcornPopper.on();
        popcornPopper.pop();
        amplifier.on();
        amplifier.setDvd(dvdPlayer);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        screen.down();
        theaterLights.dim(2);
        dvdPlayer.on();
        dvdPlayer.play(movieTitle);
    }

    public void shutItAllDown() {
        popcornPopper.off();
        dvdPlayer.eject();
        dvdPlayer.off();
        amplifier.off();
        screen.up();
        theaterLights.on();
    }
}
