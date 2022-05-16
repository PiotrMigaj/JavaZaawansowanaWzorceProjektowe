package pl.migibud.wzorceprojektowe.zadania.factory.ex1.vehicles;

public class VehicleFactory {

    public Vehicle getVehicle(VehicleType vehicleType){
        return vehicleType.getVehicle();
    }

}
