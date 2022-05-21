package pl.migibud.wzorceprojektowe.zadania.bridge.ex3;

public class TeaPurchase implements DinkPurchase {



    @Override
    public Drink buy(Double cost) {
        System.out.println("Buying a tea for: "+cost);
        return new Tea();
    }
}
