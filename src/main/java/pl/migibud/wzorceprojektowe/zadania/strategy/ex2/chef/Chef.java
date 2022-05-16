package pl.migibud.wzorceprojektowe.zadania.strategy.ex2.chef;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import pl.migibud.wzorceprojektowe.zadania.strategy.ex2.chef.egg_cooker.EggCooker;


@Getter
@Setter
public class Chef {
    private String name;
    private EggCooker eggCooker;

    public Chef(String name) {
        this.name = name;
    }

    public void cook(){
        this.eggCooker.cookEgg();
    }
}
