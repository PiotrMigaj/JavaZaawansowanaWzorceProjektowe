package pl.migibud.wzorceprojektowe.zadania.command.ex1.command;

import org.junit.jupiter.api.Test;
import pl.migibud.wzorceprojektowe.zadania.command.ex1.receiver.TextFile;

import static org.junit.jupiter.api.Assertions.*;

class CommandTest {

    private final String PODANIE = "podanie";

    @Test
    void shouldOpenFileText(){
        //given
        TextFileCommand openCommand = new OpenTextFileCommand(new TextFile(PODANIE));
        //when
        String commandExecuted = openCommand.execute();
        //then
        assertEquals("opening file: podanie",commandExecuted);
    }

    @Test
    void shouldSaveTextFile(){
        //given
        TextFileCommand saveCommand = new SaveTextFileCommand(new TextFile(PODANIE));
        //when
        String commandExecuted = saveCommand.execute();
        //then
        assertEquals("saving file: podanie",commandExecuted);
    }

}
