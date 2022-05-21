package pl.migibud.wzorceprojektowe.zadania.proxy.exsdaclasses;

public class Main {
    public static void main(String[] args) {

        ExpensiveObject o1 = new ExpensiveObjectProxy();
        ExpensiveObject o2 = new ExpensiveObjectProxy();

        o1.process();
        o2.process();

        System.out.println(ExpensiveObjectImpl.count);

    }
}
