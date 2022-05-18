package pl.migibud.wzorceprojektowe.zadania.observer.ex3.order;

import pl.migibud.wzorceprojektowe.zadania.observer.ex3.notification.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void unRegisterObserver(Observer observer);
    void observers();
}
