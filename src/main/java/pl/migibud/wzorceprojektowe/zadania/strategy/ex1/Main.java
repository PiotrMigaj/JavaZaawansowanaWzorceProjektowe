package pl.migibud.wzorceprojektowe.zadania.strategy.ex1;

public class Main {
    public static void main(String[] args) {

        OperationManager operationManager = new OperationManager();
        operationManager.setStrategy((a,b)-> System.out.println(a+b));
        operationManager.execute(2,3);

    }
}
