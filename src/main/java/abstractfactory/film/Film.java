package abstractfactory.film;

import abstractfactory.audio.Audio;
import abstractfactory.factoies.FilmFactory;
import abstractfactory.subtitles.Subtitles;

public class Film {
    private String name;
    private Audio audio;
    private Subtitles subtitles;

    public Film(String name, FilmFactory factory) {
        this.name = name;
        audio = factory.createAudio();
        subtitles = factory.createSubtitles();

    }

    public void paint() {
        System.out.println("You have selected a movie: \"" + name + "\"");
        audio.playAudio();
        subtitles.showSubtitles();
    }
}
