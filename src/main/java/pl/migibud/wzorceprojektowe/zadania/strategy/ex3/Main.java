package pl.migibud.wzorceprojektowe.zadania.strategy.ex3;

import pl.migibud.wzorceprojektowe.zadania.strategy.ex3.pricingstrategy.PriceCalculator;
import pl.migibud.wzorceprojektowe.zadania.strategy.ex3.pricingstrategy.RegularPrice;

public class Main {
    public static void main(String[] args) {

        PriceCalculator priceCalculator = new PriceCalculator();
        priceCalculator.setPricingStrategy(new RegularPrice());
        priceCalculator.calculatePrice(100,false);

    }
}
