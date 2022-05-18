package pl.migibud.wzorceprojektowe.zadania.decorator.ex3;

public class ChickenMealDecorator extends MealDecorator{

    public ChickenMealDecorator(Meal meal) {
        super(meal);
    }

    private void addChicken() {
        System.out.println("Do dania dodaję kurczaka.");
    }

    @Override
    public void prepareMeal() {
        this.meal.prepareMeal();
        addChicken();
    }
}
