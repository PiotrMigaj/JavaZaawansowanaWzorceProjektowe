package pl.migibud.wzorceprojektowe.zadania.observer.ex5;

public class Subscriber extends Observer {

    public Subscriber(YouTubeChannel youTubeChannel) {
        this.youTubeChannel = youTubeChannel;
        youTubeChannel.addObserver(this);
    }
    @Override
    public void update() {
        System.out.println("Subscriber otrzymał powiadomienie: " + youTubeChannel.getState());
    }
}
