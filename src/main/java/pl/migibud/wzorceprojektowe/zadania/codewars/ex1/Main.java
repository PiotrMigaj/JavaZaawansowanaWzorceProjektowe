package pl.migibud.wzorceprojektowe.zadania.codewars.ex1;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String input = "the_Stealth_Warrior";

//        String[] words = input.split("[-_]");
//        List<String> wordsList = Arrays.asList(words);
//        System.out.println(wordsList);
//        List<List<String>> listOfLetters = wordsList.stream().map(v->Arrays.asList(v.split(""))).collect(Collectors.toList());
//        System.out.println(listOfLetters);
//
//        List<String> myList = List.of(List.of("abc","abc")).stream().flamap(v->v.).collect(Collectors.toList());


//        String[] words = input.split("[-_]");
//        for(int i=1;i< words.length;i++){
//            String[] tmpArr = words[i].split("");
//            tmpArr[0]=tmpArr[0].toUpperCase();
//            StringBuilder stringBuilder = new StringBuilder();
//            for (String s:tmpArr) {
//                stringBuilder.append(s);
//            }
//            words[i]=stringBuilder.toString();
//            System.out.println(words[i]);
//        }
//        StringBuilder stringBuilder = new StringBuilder();
//        for (String s:words) {
//            stringBuilder.append(s);
//        }
//        System.out.println(stringBuilder);


        List<String> myList = Stream.of(List.of("abc","pol")).flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(myList);

    }
}
