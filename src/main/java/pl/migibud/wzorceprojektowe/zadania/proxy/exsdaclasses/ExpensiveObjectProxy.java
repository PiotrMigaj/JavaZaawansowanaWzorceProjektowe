package pl.migibud.wzorceprojektowe.zadania.proxy.exsdaclasses;

public class ExpensiveObjectProxy implements ExpensiveObject{

    private static ExpensiveObject object;

    @Override
    public String process() {

        if (object==null){
            object = new ExpensiveObjectImpl();
        }
        return object.process();
    }
}
