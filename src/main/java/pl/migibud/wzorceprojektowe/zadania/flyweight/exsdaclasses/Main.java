package pl.migibud.wzorceprojektowe.zadania.flyweight.exsdaclasses;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Vehicle car1 = VehicleFactory.createVehicle(Color.red);
        Vehicle car2 = VehicleFactory.createVehicle(Color.red);
        Vehicle car3 = VehicleFactory.createVehicle(Color.blue);

        System.out.println(car1==car2);
        System.out.println(car1!=car3);


    }
}
