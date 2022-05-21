package pl.migibud.wzorceprojektowe.zadania.flyweight.ex2;

import java.util.Map;
import java.util.WeakHashMap;

public class SpaceShipFactory {
    private Map<String,SpaceShip> spaceShipCache = new WeakHashMap<>();

    public SpaceShip getSpaceShip(String type){
        return spaceShipCache.computeIfAbsent(type, SpaceShip::new);
    }

    public int cacheSize(){
        return spaceShipCache.size();
    }
}
