package pl.migibud.wzorceprojektowe.zadania.factory.ex1;

import pl.migibud.wzorceprojektowe.zadania.factory.ex1.vehicles.Car;
import pl.migibud.wzorceprojektowe.zadania.factory.ex1.vehicles.Vehicle;
import pl.migibud.wzorceprojektowe.zadania.factory.ex1.vehicles.VehicleFactory;
import pl.migibud.wzorceprojektowe.zadania.factory.ex1.vehicles.VehicleType;

public class Main {

    public static void main(String[] args) {

        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle car = vehicleFactory.getVehicle(VehicleType.CAR);
        System.out.println(car.getType());

/*        Vehicle car2 = new Car();
        System.out.println(car2.getType());*/


    }
}
