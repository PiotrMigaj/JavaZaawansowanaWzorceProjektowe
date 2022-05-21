package pl.migibud.wzorceprojektowe.zadania.flyweight.exsdaclasses;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {
    private static Map<Color,Vehicle> vehicleCache = new HashMap<>();

    public static Vehicle createVehicle(Color color){
        Vehicle vehicle = vehicleCache.computeIfAbsent(color, Car::new);
        return vehicle;
    }
}
