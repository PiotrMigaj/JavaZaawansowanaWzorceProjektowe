package pl.migibud.wzorceprojektowe.zadania.strategy;

public class Addition implements Strategy {
    @Override
    public void execute(int a, int b) {
        System.out.println(a+b);
    }
}
