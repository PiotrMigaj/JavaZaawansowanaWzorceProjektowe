package pl.migibud.wzorceprojektowe.zadania.iterator.ex2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IteratorTest
{
    @Test
    void  shouldIterateOverNames(){
        Container<String> stringContainer = new StringContainer();
//        Iterator<String> iter = stringContainer.getIterator();

        List<String> names = new ArrayList<>();
        for (Iterator<String> iter = stringContainer.getIterator(); iter.hasNext();){
            String name = iter.next();
            names.add(name);
        }

        System.out.println(names);

        assertEquals(4,names.size());
        assertTrue(names.containsAll(List.of("Zofia","Stanisław","Antoni","Kazimierz")));
    }


}