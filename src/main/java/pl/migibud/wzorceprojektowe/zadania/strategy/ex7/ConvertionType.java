package pl.migibud.wzorceprojektowe.zadania.strategy.ex7;

public enum ConvertionType implements StrategyConverter {
    CSV(new CSVConverter()),PDF(new PDFConverter()),PB(new PBConverter());

    private StrategyConverter strategyConverter;

    ConvertionType(StrategyConverter strategyConverter){
        this.strategyConverter = strategyConverter;
    }

    @Override
    public String convert(String file) {
        return strategyConverter.convert(file);
    }
}
