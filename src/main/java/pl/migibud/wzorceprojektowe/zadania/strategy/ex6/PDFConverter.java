package pl.migibud.wzorceprojektowe.zadania.strategy.ex6;

public class PDFConverter implements StrategyConverter {
    @Override
    public String convert(String file) {
        return file.split("\\.")[0] + ".pdf";
    }
}
