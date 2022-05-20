package pl.migibud.wzorceprojektowe.zadania.decorator.ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArmedPlayer extends PlayerDecorator{

    private List<String> weapons  = new ArrayList<>();

    public ArmedPlayer(Character character, List<String> weapons) {
        super(character);
        this.weapons = weapons;
    }

    @Override
    public void playerSummary() {
        this.character.characterSummary();
        System.out.println(weapons.stream().collect(Collectors.joining(", ")));
    }
}
