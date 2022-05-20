package pl.migibud.wzorceprojektowe.zadania.decorator.ex5;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Character {

    private String name;
    private String type;
    private Integer strength;
    private Integer speed;

    public void characterSummary(){
        System.out.println("Your character:");
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Strength: " + strength);
        System.out.println("Speed: " + speed);
    }

}
