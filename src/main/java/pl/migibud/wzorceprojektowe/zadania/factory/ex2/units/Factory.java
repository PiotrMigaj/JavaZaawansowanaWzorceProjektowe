package pl.migibud.wzorceprojektowe.zadania.factory.ex2.units;

public interface Factory {
    InfantryUnit createInfantryUnit(UnitType unitType);
    MechanizedUnit createMechanizedUnit(UnitType unitType);
    AirUnit createAirUnit(UnitType unitType);
}
