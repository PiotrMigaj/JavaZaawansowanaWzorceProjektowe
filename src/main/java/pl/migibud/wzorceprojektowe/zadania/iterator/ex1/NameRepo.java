package pl.migibud.wzorceprojektowe.zadania.iterator.ex1;

public class NameRepo {

    private String[] names = {"Adam","Joe","John","Sarah"};

    public Iterator getIterator(){
        return new NameIterator(names);
    }
}
