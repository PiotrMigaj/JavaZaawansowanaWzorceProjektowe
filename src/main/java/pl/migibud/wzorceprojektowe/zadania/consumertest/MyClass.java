package pl.migibud.wzorceprojektowe.zadania.consumertest;

import java.util.function.Supplier;

public class MyClass {

    int price;

    public MyClass(Supplier<Integer> supplier) {
        this.price = supplier.get();
    }
}
