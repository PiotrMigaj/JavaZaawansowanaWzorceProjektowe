package pl.migibud.wzorceprojektowe.zadania.mediator.ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MediatorTest {

    @Test
    void wifeShouldLoveHusband(){
        //given
        String msgText = "you are so distant";
        Spouse wife = new Spouse("Marry",Role.WIFE);
        //when
        String messageSent = wife.sendMsg(msgText);
        //then
        assertEquals("I love you, but you are so distant",messageSent);

    }

}