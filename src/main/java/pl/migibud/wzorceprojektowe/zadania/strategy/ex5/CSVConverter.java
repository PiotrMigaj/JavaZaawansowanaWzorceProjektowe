package pl.migibud.wzorceprojektowe.zadania.strategy.ex5;

public class CSVConverter implements StrategyConverter {
    @Override
    public String convert(String file) {
        return file.split("\\.")[0] + ".csv";
    }
}
