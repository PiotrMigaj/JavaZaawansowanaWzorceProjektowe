package pl.migibud.javazaawansowanazadania.ex1.factory;

import pl.migibud.javazaawansowanazadania.ex1.providedata.DataProvider;
import pl.migibud.javazaawansowanazadania.ex1.providedata.HardcodeDataProvider;
import pl.migibud.javazaawansowanazadania.ex1.providedata.ProvideDataWithScanner;

import javax.naming.OperationNotSupportedException;

public class ProvideDataFactory {

    public static DataProvider dataProvider(SourceOfProvidedData sourceOfProvidedData){
        switch (sourceOfProvidedData){
            case SCANNER:
                return new ProvideDataWithScanner();
            case HARDCODE:
                return new HardcodeDataProvider();
            default:
                throw new UnsupportedOperationException();
        }
    }

}
