package pl.migibud.wzorceprojektowe.zadania.strategy.ex6;

public class Main {
    public static void main(String[] args) {


        String newFile = ConverterFactory.convert(ConvertionType.PDF).convert("myFile.txt");
        System.out.println(newFile);

    }
}
