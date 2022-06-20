package pl.migibud.wzorceprojektowe.zadania.iterator.ex2;

public class StringContainer implements Container<String> {

    private String[] names = {"Zofia","Stanisław","Antoni","Kazimierz"};

    @Override
    public Iterator<String> getIterator() {
        return new StringIterator(names);
    }
}
