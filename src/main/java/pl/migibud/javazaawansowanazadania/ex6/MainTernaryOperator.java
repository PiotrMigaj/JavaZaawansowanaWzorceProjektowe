package pl.migibud.javazaawansowanazadania.ex6;

import java.util.List;
import java.util.stream.Collectors;

public class MainTernaryOperator {
    public static void main(String[] args) {

        List<Integer> myList = List.of(5,3,120);
        System.out.println(stringOfIntegers(myList));
    }

    public static String stringOfIntegers(List<Integer> integerList){
        return integerList.stream().map(v -> v % 2 == 0 ? "e"+v : "o" + v).collect(Collectors.joining(","));
    }

}
