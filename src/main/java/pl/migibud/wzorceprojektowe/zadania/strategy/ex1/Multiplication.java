package pl.migibud.wzorceprojektowe.zadania.strategy.ex1;

public class Multiplication implements Strategy {
    @Override
    public void execute(int a, int b) {
        System.out.println(a*b);
    }
}
