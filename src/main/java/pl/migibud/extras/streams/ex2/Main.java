package pl.migibud.extras.streams.ex2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Map<String,Integer> myMap = new HashMap<>();
        myMap.put("Piotr",30);
        myMap.put("Ania",28);
        myMap.put("Basia",18);
        myMap.put("Wojtek",12);
        myMap.put("Ala",25);

        System.out.println(myMap);

        Set<Map.Entry<String ,Integer>>  myEntrySet = myMap.entrySet().stream().sorted(Comparator.comparingInt(Map.Entry::getValue)).collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(myEntrySet);
        Map<String,Integer> myLinkedHashMap = myEntrySet.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(v1,v2)->v2,LinkedHashMap::new));
        System.out.println(myLinkedHashMap);

    }

}
