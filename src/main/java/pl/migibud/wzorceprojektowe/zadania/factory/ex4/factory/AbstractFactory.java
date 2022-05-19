package pl.migibud.wzorceprojektowe.zadania.factory.ex4.factory;

import pl.migibud.wzorceprojektowe.zadania.factory.ex4.transport.Transport;
import pl.migibud.wzorceprojektowe.zadania.factory.ex4.transport.TransportType;

public interface AbstractFactory {

    Transport getTransport(TransportType type);

}
