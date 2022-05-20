package pl.migibud.wzorceprojektowe.zadania.decorator.ex5;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Character character = new Character("Bradley","Soldier",75,25);
        character.characterSummary();
        ArmedPlayer armedPlayer = new ArmedPlayer(character, List.of("Rifle","Claymore"));
        armedPlayer.playerSummary();

    }
}
