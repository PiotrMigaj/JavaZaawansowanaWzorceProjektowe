package pl.migibud.extras.streams.ex1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> myStream = List.of(List.of("abc","efg")).stream().flatMap(v->v.stream()).collect(Collectors.toList());
        System.out.println(myStream);


    }
}
