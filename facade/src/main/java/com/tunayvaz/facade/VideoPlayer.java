package com.tunayvaz.facade;

import lombok.extern.log4j.Log4j2;

/**
 * VideoPlayer is one of the HomeTheatre subsystems.
 */

@Log4j2
public class VideoPlayer {

    private String name;

    public VideoPlayer(String name) {
        this.name = name;
    }

    public void open() {
        log.info("Opening {} video player", name);
    }

    public void play(String series) {
        log.info("Started playing {}", series);
    }

    public void close() {
        log.info("Closing {} video player", name);
    }
}
