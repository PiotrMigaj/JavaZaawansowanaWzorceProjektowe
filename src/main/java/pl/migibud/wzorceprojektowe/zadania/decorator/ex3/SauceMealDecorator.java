package pl.migibud.wzorceprojektowe.zadania.decorator.ex3;

public class SauceMealDecorator extends MealDecorator{

    public SauceMealDecorator(Meal meal) {
        super(meal);
    }

    private void addSauce() {
        System.out.println("Do dania dodaję sos.");
    }

    @Override
    public void prepareMeal() {
        this.meal.prepareMeal();
        addSauce();
    }
}
