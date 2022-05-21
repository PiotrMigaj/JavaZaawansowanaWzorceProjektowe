package pl.migibud.wzorceprojektowe.zadania.flyweight.exsdaclasses;

import lombok.AllArgsConstructor;

import java.awt.*;

@AllArgsConstructor
public class Car implements Vehicle {

    private Color color;

    @Override
    public Color getColor() {
        return this.color;
    }
}
