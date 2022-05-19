package pl.migibud.wzorceprojektowe.zadania.factory.ex4.factory;

import java.util.NoSuchElementException;

public class FactoryProvider {

    public static AbstractFactory getFactory(FactoryMode mode){
        switch (mode){
            case CARGO:
                return new CargoFactory();
            case PASSENGER:
                return new PassengerFactory();
            default:
                throw new NoSuchElementException();
        }
    }

}
