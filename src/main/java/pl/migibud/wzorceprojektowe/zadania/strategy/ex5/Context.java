package pl.migibud.wzorceprojektowe.zadania.strategy.ex5;

public class Context {

    private StrategyConverter strategyConverter;

    public Context(StrategyConverter strategyConverter) {
        this.strategyConverter = strategyConverter;
    }

    public String executeConverter(String file){
        return strategyConverter.convert(file);
    }
}
