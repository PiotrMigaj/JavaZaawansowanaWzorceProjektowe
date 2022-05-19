package pl.migibud.wzorceprojektowe.zadania.strategy.ex6;

public class PBConverter implements StrategyConverter {
    @Override
    public String convert(String file) {
        return file.split("\\.")[0] + ".pb";
    }
}
