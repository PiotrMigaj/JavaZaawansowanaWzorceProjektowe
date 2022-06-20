package pl.migibud.wzorceprojektowe.zadania.memento.ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MementoTest {

    @Test
    void shouldSaveSequenceOfStates(){
        //given
        Originator originator = new Originator();
        originator.setState(State.NOT_READY);
        originator.setState(State.PREPARING);
        CareTaker careTaker = new CareTaker();
        careTaker.add(originator.save());
        originator.setState(State.READY);
        careTaker.add(originator.save());
        originator.setState(State.RELOADING);

        State currentState = originator.getState();

        originator.restore(careTaker.get(0));

        State firstSavedState = originator.getState();

        System.out.println(currentState);
        System.out.println(firstSavedState);
        System.out.println(careTaker.getAllStates());
        //when






    }

}