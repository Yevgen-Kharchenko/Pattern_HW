package abstractfactory.factoies;

import abstractfactory.audio.Audio;
import abstractfactory.audio.UkrainianAudio;
import abstractfactory.subtitles.Subtitles;
import abstractfactory.subtitles.UkrainianSubtitles;

public class UkrainianFactory implements FilmFactory {

    @Override
    public Audio createAudio() {
        return new UkrainianAudio();
    }

    @Override
    public Subtitles createSubtitles() {
        return new UkrainianSubtitles();
    }
}
