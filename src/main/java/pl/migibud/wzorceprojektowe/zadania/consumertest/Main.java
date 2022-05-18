package pl.migibud.wzorceprojektowe.zadania.consumertest;

public class Main {
    public static void main(String[] args) {

        MyClass myClass = new MyClass(() -> 3);
        System.out.println(myClass.price);


    }
}
