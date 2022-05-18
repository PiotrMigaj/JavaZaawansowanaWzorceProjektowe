package pl.migibud.wzorceprojektowe.zadania.decorator.ex3;

public class Main {
    public static void main(String[] args) {
        System.out.println("nowy posiłek");

        Meal myMeal = new SauceMealDecorator(new ChickenMealDecorator(new PotatoMeal()));
        myMeal.prepareMeal();


    }
}
