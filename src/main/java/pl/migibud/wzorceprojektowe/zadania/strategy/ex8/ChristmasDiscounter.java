package pl.migibud.wzorceprojektowe.zadania.strategy.ex8;

import java.math.BigDecimal;

public class ChristmasDiscounter implements Discounter {

    private final static BigDecimal DISCOUNT = BigDecimal.valueOf(0.9);

    @Override
    public BigDecimal applyDiscount(BigDecimal amount) {
        return amount.multiply(DISCOUNT);
    }
}
