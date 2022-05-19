package pl.migibud.wzorceprojektowe.zadania.prototype.ex2;

public class Rabbit extends AnimalPrototype {

    public Rabbit(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void say(){
        System.out.println("To królik: "+name+" jego waga to "+weight+" kg.");
    }
}
