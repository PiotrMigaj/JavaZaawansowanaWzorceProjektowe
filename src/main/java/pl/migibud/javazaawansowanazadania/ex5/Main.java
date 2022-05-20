package pl.migibud.javazaawansowanazadania.ex5;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> myList = List.of("ala","Basia","ani","Kaja");
        List<String> anotherList = myList.stream().filter(v->v.length()==3).filter(v->v.startsWith("a")).collect(Collectors.toList());
        System.out.println(anotherList);

    }

}
