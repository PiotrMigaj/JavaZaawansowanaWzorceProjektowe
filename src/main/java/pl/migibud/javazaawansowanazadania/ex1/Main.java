package pl.migibud.javazaawansowanazadania.ex1;

import pl.migibud.javazaawansowanazadania.ex1.providedata.ProvideDataWithScanner;
import pl.migibud.javazaawansowanazadania.ex1.reversenumber.ReverseNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static pl.migibud.javazaawansowanazadania.ex1.factory.SourceOfProvidedData.HARDCODE;
import static pl.migibud.javazaawansowanazadania.ex1.factory.SourceOfProvidedData.SCANNER;

public class Main {

    public static void main(String[] args) {
        run();
    }

    public static void run(){
        int reversedNumber = ReverseNumber.getReversedNumber(HARDCODE);
        System.out.println(reversedNumber);
    }
}
