package pl.migibud.javazaawansowanazadania.ex1.providedata;

import java.util.Scanner;

public class ProvideDataWithScanner implements DataProvider{

    private final Scanner SCANNER = new Scanner(System.in);

    @Override
    public int getNumber() {
        return SCANNER.nextInt();
    }
}
