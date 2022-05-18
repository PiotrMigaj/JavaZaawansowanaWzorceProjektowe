package pl.migibud.wzorceprojektowe.zadania.observer.ex3.order;

import pl.migibud.wzorceprojektowe.zadania.observer.ex3.notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class Order implements Observable{

    private long orderNumber;
    private OrderStatus orderStatus;
    private Set<Observer> registeredObservers = new HashSet<>();

    public Order(long orderNumber, OrderStatus orderStatus) {
        this.orderNumber = orderNumber;
        this.orderStatus = orderStatus;
    }

    public long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void notifyObservers(){
        this.registeredObservers.forEach(v->v.update(this));
    }

    public void changeOrderStatus(OrderStatus status){
        this.setOrderStatus(status);
        this.notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.registeredObservers.add(observer);
    }

    @Override
    public void unRegisterObserver(Observer observer) {
        this.registeredObservers.remove(observer);
    }

    @Override
    public void observers() {

    }
}
