package pl.migibud.wzorceprojektowe.zadania.strategy.ex8;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

//        BigDecimal result = StrategyPicker.discountedPrice(new ChristmasDiscounter(),BigDecimal.valueOf(109.98));
//        System.out.println(result);

        StrategyPicker strategyPicker = new StrategyPicker(new ChristmasDiscounter());

        BigDecimal bigDecimal = strategyPicker.applyDiscount(BigDecimal.valueOf(100.98));

        System.out.println(bigDecimal);

    }

}
