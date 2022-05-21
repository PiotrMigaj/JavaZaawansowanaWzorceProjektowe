package pl.migibud.wzorceprojektowe.zadania.bridge.ex2;

public interface FifoCollection<T> {
    void offer(T element);
    T poll();
}
