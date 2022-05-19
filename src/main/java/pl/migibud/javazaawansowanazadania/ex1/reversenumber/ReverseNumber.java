package pl.migibud.javazaawansowanazadania.ex1.reversenumber;

import pl.migibud.javazaawansowanazadania.ex1.factory.ProvideDataFactory;
import pl.migibud.javazaawansowanazadania.ex1.factory.SourceOfProvidedData;
import pl.migibud.javazaawansowanazadania.ex1.providedata.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class ReverseNumber {

    public static int getReversedNumber(SourceOfProvidedData sourceOfProvidedData){

        ProvideDataFactory.dataProvider(sourceOfProvidedData);

        int number = ProvideDataFactory.dataProvider(sourceOfProvidedData).getNumber();

        if (number<9){
            return number;
        }
        int num = number;
        List<Integer> myIntegerList = new ArrayList<>();
        while (num!=0){
            myIntegerList.add(num%10);
            num=num/10;
        }
        return changeListOfIntegersToInt(myIntegerList);
    }

    private static int changeListOfIntegersToInt(List<Integer> myList){

        StringBuilder stringBuilder = new StringBuilder();
        myList.forEach(stringBuilder::append);
        return Integer.parseInt(stringBuilder.toString());
    }

}
