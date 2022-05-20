package pl.migibud.wzorceprojektowe.zadania.observer.ex5;

public class TwitterAccount extends Observer {

    public TwitterAccount(YouTubeChannel youTubeChannel) {
        this.youTubeChannel = youTubeChannel;
        youTubeChannel.addObserver(this);
    }
    @Override
    public void update() {
        System.out.println("Twitter account otrzymał powiadomienie: " + youTubeChannel.getState());
    }
}
