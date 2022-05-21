package pl.migibud.wzorceprojektowe.zadania.bridge.ex3;

public class Main {
    public static void main(String[] args) {

        Drink drink = new TeaPurchase().buy(30.0);

        System.out.println(drink instanceof Tea);

        drink.toString();

    }
}
