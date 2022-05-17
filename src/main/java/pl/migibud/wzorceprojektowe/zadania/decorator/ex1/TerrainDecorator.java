package pl.migibud.wzorceprojektowe.zadania.decorator.ex1;

public abstract class TerrainDecorator extends Terrain{

    protected Terrain terrain;
    public TerrainDecorator(Terrain terrain) {
        super("", 0);
        this.terrain=terrain;
    }
}
