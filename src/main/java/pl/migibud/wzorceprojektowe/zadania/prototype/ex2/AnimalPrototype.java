package pl.migibud.wzorceprojektowe.zadania.prototype.ex2;

public abstract class AnimalPrototype implements Cloneable{

    protected String name;
    protected double weight;

    public AnimalPrototype clone() throws CloneNotSupportedException {
        AnimalPrototype animalPrototype = null;
        animalPrototype = (AnimalPrototype) super.clone();
        return animalPrototype;
    }


}
