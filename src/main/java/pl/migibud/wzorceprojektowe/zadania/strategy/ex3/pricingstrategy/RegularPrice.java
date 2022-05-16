package pl.migibud.wzorceprojektowe.zadania.strategy.ex3.pricingstrategy;

public class RegularPrice implements PricingStrategy {
    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if (!isSignedUpForNewsletter){
            System.out.println(price);
        }else {
            System.out.println("WRONG");
        }
    }
}
