package pl.migibud.wzorceprojektowe.zadania.prototype.ex2;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Map<String,AnimalPrototype> animalsMap = new HashMap<>();
        animalsMap.put("Sheep",new Sheep("Doly",10.5));
        animalsMap.put("Rabbit",new Sheep("Roger",1.5));

        Sheep clonedSheep = (Sheep) animalsMap.get("Sheep").clone();
        clonedSheep.say();


    }

}
