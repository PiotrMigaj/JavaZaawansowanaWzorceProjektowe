package pl.migibud.wzorceprojektowe.zadania.adapter.ex1;

public class UKToContinentalAdapter implements ContinentalDevice{

    private UKDevice ukDevice;

    public UKToContinentalAdapter(UKDevice ukDevice) {
        this.ukDevice = ukDevice;
    }


    @Override
    public void continentalDeviceOn() {
        this.ukDevice.ukDeviceOn();
    }
}
