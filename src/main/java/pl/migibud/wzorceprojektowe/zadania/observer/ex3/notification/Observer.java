package pl.migibud.wzorceprojektowe.zadania.observer.ex3.notification;

import pl.migibud.wzorceprojektowe.zadania.observer.ex3.order.Order;

public interface Observer {

    void update(Order order);

}
