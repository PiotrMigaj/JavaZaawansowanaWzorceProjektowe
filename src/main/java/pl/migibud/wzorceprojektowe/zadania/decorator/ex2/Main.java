package pl.migibud.wzorceprojektowe.zadania.decorator.ex2;

public class Main {
    public static void main(String[] args) {

        Beverage b = new Sugar(new Milk(new PlainBeverage()));
        System.out.println(b.getCost());
        System.out.println(b.getDescription());

        Beverage c = new Milk(new Sugar(new PlainBeverage()));
        System.out.println(c.getCost());
        System.out.println(c.getDescription());

    }
}
