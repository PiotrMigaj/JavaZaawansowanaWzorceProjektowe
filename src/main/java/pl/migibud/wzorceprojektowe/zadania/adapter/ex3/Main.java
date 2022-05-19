package pl.migibud.wzorceprojektowe.zadania.adapter.ex3;

public class Main {
    public static void main(String[] args) {
        AmazonItem amazonItem = new GofBook();
        Adapter adapter = new DollarAdapter(amazonItem);
        System.out.println(adapter.convert());

    }
}
