package pl.migibud.wzorceprojektowe.zadania.observer.ex3;

import pl.migibud.wzorceprojektowe.zadania.observer.ex3.notification.Email;
import pl.migibud.wzorceprojektowe.zadania.observer.ex3.notification.MobileApp;
import pl.migibud.wzorceprojektowe.zadania.observer.ex3.notification.TextMessage;
import pl.migibud.wzorceprojektowe.zadania.observer.ex3.order.Order;
import pl.migibud.wzorceprojektowe.zadania.observer.ex3.order.OrderStatus;

public class Main {
    public static void main(String[] args) {

        Order order = new Order(110L, OrderStatus.ZAREJESTROWANE);
        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        order.registerObserver(textMessage);
        order.registerObserver(mobileApp);
        order.registerObserver(email);

        order.notifyObservers();
        System.out.println();
        order.changeOrderStatus(OrderStatus.WYSLANE);




    }
}
