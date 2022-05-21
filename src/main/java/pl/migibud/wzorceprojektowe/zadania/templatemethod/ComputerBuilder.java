package pl.migibud.wzorceprojektowe.zadania.templatemethod;

import java.util.HashMap;
import java.util.Map;

public abstract class ComputerBuilder {

    Map<String, String> computerParts = new HashMap<>();

    public final Computer buildComputer(){
        addMotherBoard();
        setUpMotherBoard();
        addProcessor();
        return new Computer(computerParts);
    }

    protected abstract void addProcessor();

    protected abstract void setUpMotherBoard();

    protected abstract void addMotherBoard();

}
