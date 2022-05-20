package pl.migibud.javazaawansowanazadania.ex3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1,2);
        double average = integerList.stream().mapToInt(v->v).average().getAsDouble();
        System.out.println(average);
    }
}
