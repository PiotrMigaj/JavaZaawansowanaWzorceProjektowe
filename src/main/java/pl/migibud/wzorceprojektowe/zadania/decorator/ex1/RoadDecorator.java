package pl.migibud.wzorceprojektowe.zadania.decorator.ex1;

public class RoadDecorator extends TerrainDecorator {
    public RoadDecorator(Terrain terrain) {
        super(terrain);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " przez który przebiega droga";
    }

    @Override
    public int fuelCost() {
        return terrain.fuelCost()-10;
    }
}
