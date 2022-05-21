package pl.migibud.wzorceprojektowe.zadania.proxy.exsdaclasses;

public class ExpensiveObjectImpl implements ExpensiveObject {

    public static int count;

    public ExpensiveObjectImpl() {
        heavyInitialConfiguration();
        count++;
    }

    private void heavyInitialConfiguration() {
        System.out.println("loading ");
    }

    @Override
    public String process() {
        return "processing completed";
    }
}
