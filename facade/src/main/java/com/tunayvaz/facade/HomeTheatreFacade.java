package com.tunayvaz.facade;

/**
 * HomeTheatreFacade provides a single interface through which users can operate the
 * subsystems.
 *
 * This makes the watching series easier to operate and cuts the dependencies from the home theatre user to
 * the subsystems.
 */
public class HomeTheatreFacade {

    private Speaker speaker;
    private VideoPlayer videoPlayer;
    private Projector projector;
    private Lights lights;
    private Screen screen;
    private PopcornPopper popper;

    public HomeTheatreFacade(String playerName) {
        this.speaker = new Speaker();
        this.videoPlayer = new VideoPlayer(playerName);
        this.projector = new Projector();
        this.lights = new Lights();
        this.screen = new Screen();
        this.popper = new PopcornPopper();
    }

    public void watchSeries(String series) {
        popper.pop();
        screen.turnOn();
        projector.turnOn();
        videoPlayer.open();
        speaker.setVolume(5);
        lights.dim(40);
        videoPlayer.play(series);
    }

    public void close() {
        lights.brighten(100);
        screen.turnOff();
        projector.turnOff();
        videoPlayer.close();
    }
}