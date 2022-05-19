package pl.migibud.wzorceprojektowe.zadania.factory.ex3;

import pl.migibud.wzorceprojektowe.zadania.factory.ex3.cargotransport.CargoTransport;
import pl.migibud.wzorceprojektowe.zadania.factory.ex3.cargotransport.Plane;
import pl.migibud.wzorceprojektowe.zadania.factory.ex3.cargotransport.Ship;
import pl.migibud.wzorceprojektowe.zadania.factory.ex3.cargotransport.Truck;

public class TransportFactory {
    public static final String TRUCK = "truck";
    public static final String PLANE = "plane";
    public static final String SHIP = "ship";

    public static CargoTransport getTransport(String transportName){

        CargoTransport cargoTransport= null;

        switch (transportName){
            case TRUCK:
                cargoTransport = new Truck();
                break;
            case PLANE:
                cargoTransport = new Plane();
                break;
            case SHIP:
                cargoTransport = new Ship();
                break;
            default:
                cargoTransport = null;
        }
        return cargoTransport;
    }
}
