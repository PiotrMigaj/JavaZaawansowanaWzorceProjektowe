package pl.migibud.wzorceprojektowe.zadania.decorator.ex3;

public class RiceMeal implements Meal{
    @Override
    public void prepareMeal() {
        System.out.println("Przygotowuję danie na bazie ziemniaków.");
    }
}
