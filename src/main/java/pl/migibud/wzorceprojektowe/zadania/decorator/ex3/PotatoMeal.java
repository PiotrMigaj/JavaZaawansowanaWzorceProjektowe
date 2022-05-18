package pl.migibud.wzorceprojektowe.zadania.decorator.ex3;

public class PotatoMeal implements Meal{
    @Override
    public void prepareMeal() {
        System.out.println("Przygotowuję danie na bazie ryżu.");
    }
}
