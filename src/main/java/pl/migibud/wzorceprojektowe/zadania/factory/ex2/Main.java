package pl.migibud.wzorceprojektowe.zadania.factory.ex2;

import pl.migibud.wzorceprojektowe.zadania.factory.ex2.units.*;

public class Main {

    public static void main(String[] args) {

//        Unit tank = new Tank(200,0,20);
//        Unit infantryman = new Rifleman(100,0,10);

//        InfantryFactory factory = new RedInfantryUnitFactory();
//
//        InfantryUnit tank = factory.createUnit(UnitType.TANK);
//        InfantryUnit infantryman = factory.createUnit(UnitType.RIFLEMAN);
//        //Unit tank2 = new Tank();

        Factory blueFactory = new BlueFactory();
        Factory redFactory = new RedFactory();

        MechanizedUnit redTank = redFactory.createMechanizedUnit( UnitType.TANK);
        InfantryUnit redInfantry = redFactory.createInfantryUnit(UnitType.RIFLEMAN);
        AirUnit redHeli = redFactory.createAirUnit(UnitType.HELICOPTER);

        MechanizedUnit blueTank = blueFactory.createMechanizedUnit(UnitType.TANK);
        InfantryUnit blueInfantry = blueFactory.createInfantryUnit(UnitType.RIFLEMAN);
        AirUnit blueHeli = blueFactory.createAirUnit(UnitType.HELICOPTER);


    }
}
