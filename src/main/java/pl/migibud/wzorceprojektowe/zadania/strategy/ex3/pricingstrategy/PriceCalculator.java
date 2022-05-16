package pl.migibud.wzorceprojektowe.zadania.strategy.ex3.pricingstrategy;

public class PriceCalculator implements PricingStrategy{

    private PricingStrategy pricingStrategy;

    public PriceCalculator() {}

    public PricingStrategy getPricingStrategy() {
        return pricingStrategy;
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        this.pricingStrategy.calculatePrice(price,isSignedUpForNewsletter);
    }
}
