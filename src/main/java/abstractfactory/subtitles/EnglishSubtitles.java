package abstractfactory.subtitles;

public class EnglishSubtitles implements Subtitles {
    @Override
    public void showSubtitles() {
        System.out.println("Show english subtitles.");
    }
}
