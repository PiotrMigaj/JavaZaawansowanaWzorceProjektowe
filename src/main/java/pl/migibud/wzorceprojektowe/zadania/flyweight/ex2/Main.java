package pl.migibud.wzorceprojektowe.zadania.flyweight.ex2;

import pl.migibud.wzorceprojektowe.zadania.factory.ex2.units.Factory;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        SpaceShipFactory spaceShipFactory = new SpaceShipFactory();
        IntStream.range(0,10).forEach((i)->{
            SpaceShip spaceShip = spaceShipFactory.getSpaceShip("Cruiser");
            spaceShip.setPositionX(i);
            spaceShip.setPositionY(i);
            spaceShip.display();
        });


        IntStream.range(0,10).forEach((i)->{
            SpaceShip spaceShip = spaceShipFactory.getSpaceShip("Fighter3B");
            spaceShip.setPositionX(ThreadLocalRandom.current().nextInt(i,50));
            spaceShip.setPositionY(ThreadLocalRandom.current().nextInt(i,100));
            spaceShip.display();
        });
        System.out.println("Stworzono: "+ spaceShipFactory.cacheSize());

    }
}
