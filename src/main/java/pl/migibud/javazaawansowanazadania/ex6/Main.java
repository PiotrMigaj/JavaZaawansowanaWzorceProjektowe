package pl.migibud.javazaawansowanazadania.ex6;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> myList = List.of(32,5,3,120);
        System.out.println(stringOfIntegers(myList));
    }

    public static String stringOfIntegers(List<Integer> integerList){
        return integerList.stream().map(v->prefix(v)+v.toString()).collect(Collectors.joining(","));
    }

    private static String prefix(Integer integer){
        if (integer%2==0){
            return "e";
        }
        return "o";
    }
}
