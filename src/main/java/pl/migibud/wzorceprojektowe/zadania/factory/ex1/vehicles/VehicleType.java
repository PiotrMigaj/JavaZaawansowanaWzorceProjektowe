package pl.migibud.wzorceprojektowe.zadania.factory.ex1.vehicles;

public enum VehicleType {
    CAR(new Car()),
    BIKE(new Bike()),
    TRUCK(new Truck());

    private Vehicle vehicle;

    VehicleType(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }
}
