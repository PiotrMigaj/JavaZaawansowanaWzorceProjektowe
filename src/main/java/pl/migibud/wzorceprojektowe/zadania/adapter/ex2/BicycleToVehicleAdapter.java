package pl.migibud.wzorceprojektowe.zadania.adapter.ex2;

public class BicycleToVehicleAdapter implements Vehicle {

    private Bicycle bicycle;

    public BicycleToVehicleAdapter(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public void accelerate() {
        this.bicycle.go();
    }
}
