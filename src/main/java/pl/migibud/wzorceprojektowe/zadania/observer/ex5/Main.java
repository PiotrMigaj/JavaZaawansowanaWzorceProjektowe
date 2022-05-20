package pl.migibud.wzorceprojektowe.zadania.observer.ex5;

public class Main {
    public static void main(String[] args) {
        YouTubeChannel youTubeChannel = new YouTubeChannel();
        Fanpage fanpage = new Fanpage(youTubeChannel);
        youTubeChannel.setState("Nowy filmik coś tam !");
    }
}
