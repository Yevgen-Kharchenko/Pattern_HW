package abstractfactory.audio;

public class FranceAudio implements Audio {
    @Override
    public void playAudio() {
        System.out.println("Lecture audio en français.");
    }
}
