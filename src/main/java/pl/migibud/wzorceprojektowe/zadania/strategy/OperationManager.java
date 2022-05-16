package pl.migibud.wzorceprojektowe.zadania.strategy;

public class OperationManager implements Strategy{

//    private static OperationManager operationManager = new OperationManager();
//    private Strategy strategy;
//
//
//    private OperationManager() {
//
//    }
//
//    public static OperationManager getOperationManager(){
//        return operationManager;
//    }
//
//    public void setOperation(Strategy strategy){
//        operationManager.strategy = strategy;
//    }
//
//    public void performOperation(int a, int b){
//        operationManager.strategy.execute(a,b);
//    }

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void execute(int a, int b) {
        this.strategy.execute(a,b);
    }
}
