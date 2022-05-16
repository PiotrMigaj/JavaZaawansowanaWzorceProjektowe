package pl.migibud.wzorceprojektowe.zadania.factory.ex2;

import pl.migibud.wzorceprojektowe.zadania.factory.ex2.units.*;

public class Main {

    public static void main(String[] args) {

//        Unit tank = new Tank(200,0,20);
//        Unit infantryman = new Rifleman(100,0,10);

        Factory factory = new UnitFactory();

        Unit tank = factory.createUnit(UnitType.TANK);
        Unit infantryman = factory.createUnit(UnitType.RIFLEMAN);
        //Unit tank2 = new Tank();


    }
}
