package pl.migibud.wzorceprojektowe.zadania.factory.ex4.factory;

import pl.migibud.wzorceprojektowe.zadania.factory.ex4.transport.*;

public class CargoFactory implements AbstractFactory {
    @Override
    public Transport getTransport(TransportType type) {
        Transport transport;
        switch (type) {
            case BUS_TRUCK:
                transport = new CargoTruck();
                break;
            case SHIP:
                transport = new CargoShip();
                break;
            case PLANE:
                transport = new CargoPlane();
                break;
            default:
                transport = null;
        }
        return transport;
    }
}
