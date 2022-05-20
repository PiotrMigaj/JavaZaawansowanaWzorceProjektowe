package pl.migibud.wzorceprojektowe.zadania.observer.ex5;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel {

    private List<Observer> observerList = new ArrayList<>();

    private String state;

    public void setState(String state) {
        this.state = state;
        this.notifyAllObservers();
    }

    public String getState() {
        return state;
    }

    public void addObserver(Observer observer){
        observerList.add(observer);
    }

    private void notifyAllObservers(){
        observerList.forEach(Observer::update);
    }

}
