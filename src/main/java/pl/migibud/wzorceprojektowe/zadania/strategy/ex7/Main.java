package pl.migibud.wzorceprojektowe.zadania.strategy.ex7;

public class Main {
    public static void main(String[] args) {


        String newFile = ConvertionType.PDF.convert("myFile.txt");
        System.out.println(newFile);

    }
}
