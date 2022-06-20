package pl.migibud.SDAJavaZaawansowanaZadania.day1.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Day1Ex1 {

    public static List<String> sortUsingAnonymousClass(List<String> unsorted){
        List<String> sorted = new ArrayList<>(unsorted);
//        sorted.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
////                return o2.compareTo(o1);
//                return -o1.compareTo(o2);
//            }
//        });
        Collections.sort(sorted, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });
        return sorted;
    }
}
