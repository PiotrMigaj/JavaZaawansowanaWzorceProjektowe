package pl.migibud.extras.ex1generics;

public class Main {
    public static void main(String[] args) {
        PMIGGenericArray array = new PMIGGenericArray();

        array.addObject(2);
        array.addObject("Piotr");

        Integer integer = array.getObj(0);
        System.out.println(integer);

        String myString = array.getObj(1);
        System.out.println(myString);
    }
}
