package pl.migibud.wzorceprojektowe.zadania.decorator.ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MedicPlayer extends PlayerDecorator{

    private List<String> equipments  = new ArrayList<>();

    public MedicPlayer(Character character, List<String> equipments) {
        super(character);
        this.equipments = equipments;
    }

    @Override
    public void playerSummary() {
        this.character.characterSummary();
        System.out.println(equipments.stream().collect(Collectors.joining(", ")));
    }
}
