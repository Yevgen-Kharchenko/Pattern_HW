package abstractfactory.factoies;

import abstractfactory.audio.Audio;
import abstractfactory.audio.EnglishAudio;
import abstractfactory.subtitles.EnglishSubtitles;
import abstractfactory.subtitles.Subtitles;

public class EnglishFactory implements FilmFactory {
    @Override
    public Audio createAudio() {
        return new EnglishAudio();
    }

    @Override
    public Subtitles createSubtitles() {
        return new EnglishSubtitles();
    }
}
