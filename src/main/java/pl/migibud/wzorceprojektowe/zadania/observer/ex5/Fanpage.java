package pl.migibud.wzorceprojektowe.zadania.observer.ex5;

public class Fanpage extends Observer {

    public Fanpage(YouTubeChannel youTubeChannel) {
        this.youTubeChannel = youTubeChannel;
        youTubeChannel.addObserver(this);
    }
    @Override
    public void update() {
        System.out.println("Fanpage otrzymał powiadomienie: " + youTubeChannel.getState());
    }
}
