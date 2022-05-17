package pl.migibud.wzorceprojektowe.zadania.decorator.ex1;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public abstract class Terrain {

    @Getter
    private String description;
    private int fuelCost;

    public int fuelCost(){
        return fuelCost;
    }

}
