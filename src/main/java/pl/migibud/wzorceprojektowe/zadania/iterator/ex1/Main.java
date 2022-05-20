package pl.migibud.wzorceprojektowe.zadania.iterator.ex1;

public class Main {

    public static void main(String[] args) {

        NameRepo nameRepo = new NameRepo();
        Iterator myIterator = nameRepo.getIterator();

        while (myIterator.hasNext()){
            System.out.println(myIterator.next());
        }

    }

}
