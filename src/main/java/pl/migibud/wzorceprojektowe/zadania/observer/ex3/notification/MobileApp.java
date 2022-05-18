package pl.migibud.wzorceprojektowe.zadania.observer.ex3.notification;

import pl.migibud.wzorceprojektowe.zadania.observer.ex3.order.Order;

public class MobileApp implements Observer {

    @Override
    public void update(Order order){
        System.out.println("Aplikacja mobilna - Zamówienie nr: "+order.getOrderNumber()+" zmieniło status na: "+order.getOrderStatus());
    }

}
