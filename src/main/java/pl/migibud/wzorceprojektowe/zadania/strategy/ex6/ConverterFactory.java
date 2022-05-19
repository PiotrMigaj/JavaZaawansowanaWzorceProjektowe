package pl.migibud.wzorceprojektowe.zadania.strategy.ex6;

import java.util.NoSuchElementException;

public class ConverterFactory {

    public static StrategyConverter convert(ConvertionType type){
        switch (type){
            case CSV:
                return new CSVConverter();
            case PDF:
                return new PDFConverter();
            case PB:
                return new PBConverter();
            default:
                throw new NoSuchElementException();
        }
    }

}
