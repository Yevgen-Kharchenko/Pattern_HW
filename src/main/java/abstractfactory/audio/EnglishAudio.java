package abstractfactory.audio;

public class EnglishAudio implements Audio {
    @Override
    public void playAudio() {
        System.out.println("Plays English audio.");
    }
}
