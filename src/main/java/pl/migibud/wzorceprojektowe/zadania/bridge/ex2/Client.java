package pl.migibud.wzorceprojektowe.zadania.bridge.ex2;

import java.util.LinkedList;

public class Client {

    public static void main(String[] args) {

        FifoCollection<Integer> collection = new Queue<>(new LinkedList<>());
        collection.offer(10);
        collection.offer(40);
        collection.offer(99);
        collection.offer(150);

        System.out.println(collection.poll());
        System.out.println(collection.poll());
        System.out.println(collection.poll());
        System.out.println(collection.poll());
        System.out.println(collection.poll());

    }

}
