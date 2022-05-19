package pl.migibud.wzorceprojektowe.zadania.factory.ex4.factory;

import pl.migibud.wzorceprojektowe.zadania.factory.ex4.transport.*;

public class PassengerFactory implements AbstractFactory {
    @Override
    public Transport getTransport(TransportType type) {
        Transport transport;
        switch (type) {
            case BUS_TRUCK:
                transport = new PassengerBus();
                break;
            case SHIP:
                transport = new PassengerPlane();
                break;
            case PLANE:
                transport = new PassengerShip();
                break;
            default:
                transport = null;
        }
        return transport;
    }
}
