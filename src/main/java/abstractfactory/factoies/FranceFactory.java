package abstractfactory.factoies;

import abstractfactory.audio.Audio;
import abstractfactory.audio.FranceAudio;
import abstractfactory.subtitles.FranceSubtitles;
import abstractfactory.subtitles.Subtitles;

public class FranceFactory implements FilmFactory {
    @Override
    public Audio createAudio() {
        return new FranceAudio();
    }

    @Override
    public Subtitles createSubtitles() {
        return new FranceSubtitles();

    }
}
