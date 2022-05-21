package pl.migibud.wzorceprojektowe.zadania.bridge.ex3;

public class CoffeePurchase implements DinkPurchase {
    @Override
    public Drink buy(Double cost) {
        System.out.println("Buying a coffee for: "+cost);
        return new Coffee();
    }
}
