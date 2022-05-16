package pl.migibud.wzorceprojektowe.zadania.strategy.ex3.pricingstrategy;

public class SalePrice implements PricingStrategy {
    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if (isSignedUpForNewsletter){
            System.out.println(0.5f*price);
        }else{
            System.out.println("WRONG");
        }
    }
}
