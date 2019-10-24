package abstractfactory.factoies;

import abstractfactory.audio.Audio;
import abstractfactory.subtitles.Subtitles;

public interface FilmFactory {
    Audio createAudio();

    Subtitles createSubtitles();
}
