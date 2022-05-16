package pl.migibud.wzorceprojektowe.zadania.adapter.ex1;

public class Main {

    public static void main(String[] args) {

        ContinentalDevice continentalRadio = () -> System.out.println("continental radio plays some music");
        UKDevice ukRadio = () -> System.out.println("UK radio plays some music");

        ContinentalSocket continentalSocket = new ContinentalSocket();
        continentalSocket.powerOn(continentalRadio);

        UKToContinentalAdapter adapter = new UKToContinentalAdapter(ukRadio);
        continentalSocket.powerOn(adapter);



    }

}
