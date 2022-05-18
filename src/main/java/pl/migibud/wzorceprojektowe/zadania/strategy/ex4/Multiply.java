package pl.migibud.wzorceprojektowe.zadania.strategy.ex4;

public class Multiply implements Strategy {
    @Override
    public void execute(int a, int b) {
        System.out.println(a*b);
    }
}
