package pl.migibud.wzorceprojektowe.zadania.adapter.ex2;

public class Main {

    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle bud = new Bus();
        Vehicle bicycle = new BicycleToVehicleAdapter(new Bicycle());

        car.accelerate();
        bud.accelerate();
        bicycle.accelerate();
    }

}
