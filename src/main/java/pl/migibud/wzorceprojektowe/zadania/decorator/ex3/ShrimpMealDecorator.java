package pl.migibud.wzorceprojektowe.zadania.decorator.ex3;

public class ShrimpMealDecorator extends MealDecorator{

    public ShrimpMealDecorator(Meal meal) {
        super(meal);
    }

    private void addShrimp() {
        System.out.println("Do dania dodaję krewetki.");
    }

    @Override
    public void prepareMeal() {
        this.meal.prepareMeal();
        addShrimp();
    }
}
