package pl.migibud.wzorceprojektowe.zadania.strategy.ex8;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class StrategyPicker {

//    public static Discounter chooseDiscounter(LocalDate date){
//
//        Month month = date.getMonth();
//        Discounter discounter = new DefaultDiscounter();
//        if (Month.DECEMBER.equals(month)){
//            discounter = new ChristmasDiscounter();
//        }
//        return discounter;
//    }

//    public static BigDecimal discountedPrice(Discounter discounter, BigDecimal amount){
//
//        return discounter.applyDiscount(amount);
//    }

    private Discounter discounter;

    public StrategyPicker(Discounter discounter) {
        this.discounter = discounter;
    }

    public BigDecimal applyDiscount(BigDecimal amount){
        return discounter.applyDiscount(amount);
    }
}
