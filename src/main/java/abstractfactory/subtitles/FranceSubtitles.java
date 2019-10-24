package abstractfactory.subtitles;

public class FranceSubtitles implements Subtitles {
    @Override
    public void showSubtitles() {
        System.out.println("Afficher les sous-titres français.");
    }
}
