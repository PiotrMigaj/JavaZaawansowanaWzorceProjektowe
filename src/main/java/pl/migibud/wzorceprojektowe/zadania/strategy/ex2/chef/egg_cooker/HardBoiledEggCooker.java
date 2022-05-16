package pl.migibud.wzorceprojektowe.zadania.strategy.ex2.chef.egg_cooker;

public class HardBoiledEggCooker implements EggCooker {
    @Override
    public void cookEgg() {
        System.out.println("Gotuję jajka na twardo!");
    }
}
