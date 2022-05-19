package pl.migibud.wzorceprojektowe.zadania.factory.ex4;

import pl.migibud.wzorceprojektowe.zadania.factory.ex4.factory.AbstractFactory;
import pl.migibud.wzorceprojektowe.zadania.factory.ex4.factory.FactoryMode;
import pl.migibud.wzorceprojektowe.zadania.factory.ex4.factory.FactoryProvider;
import pl.migibud.wzorceprojektowe.zadania.factory.ex4.transport.Transport;
import pl.migibud.wzorceprojektowe.zadania.factory.ex4.transport.TransportType;

public class Main {

    public static void main(String[] args) {

        AbstractFactory cargoFactory = FactoryProvider.getFactory(FactoryMode.CARGO);
        Transport transport = cargoFactory.getTransport(TransportType.BUS_TRUCK);
        transport.process();
    }

}
