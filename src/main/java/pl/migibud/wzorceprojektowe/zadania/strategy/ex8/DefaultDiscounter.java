package pl.migibud.wzorceprojektowe.zadania.strategy.ex8;

import java.math.BigDecimal;

public class DefaultDiscounter implements Discounter {

    private final static BigDecimal DISCOUNT = new BigDecimal("1.0");

    @Override
    public BigDecimal applyDiscount(BigDecimal amount) {
        return amount;
    }
}
