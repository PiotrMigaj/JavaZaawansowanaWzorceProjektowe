package pl.migibud.wzorceprojektowe.zadania.decorator.ex3;

public abstract class MealDecorator implements Meal{

    Meal meal;

    public MealDecorator(Meal meal) {
        this.meal = meal;
    }

    @Override
    public void prepareMeal() {
        this.meal.prepareMeal();
    }
}
