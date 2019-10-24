package abstractfactory.audio;

public class UkrainianAudio implements Audio {
    @Override
    public void playAudio() {
        System.out.println("Грає українське аудіо");
    }
}
