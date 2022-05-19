package pl.migibud.wzorceprojektowe.zadania.strategy.ex5;

public class Main {
    public static void main(String[] args) {

        Context context = new Context(new CSVConverter());

        String newFile = context.executeConverter("example.txt");
        System.out.println(newFile);

    }
}
