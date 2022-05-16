package pl.migibud.wzorceprojektowe.zadania.factory.ex2.units;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public abstract class InfantryUnit {
    private int hp;
    private int exp;
    private int dmgDone;
}
