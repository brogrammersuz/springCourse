package uz.brogrammers;

public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Music name " + music.getSong() + " is playing");
    }
}
