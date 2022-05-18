package pl.migibud.wzorceprojektowe.zadania.strategy.ex4;

public abstract class StrategyOption {

//    Strategy strategy;
//
//    public StrategyOption(Strategy strategy) {
//        this.strategy = strategy;
//    }

    public static void setStrategy(StrategyType type, int a, int b){
        switch (type){
            case ADD:
                new Add().execute(a,b);
                break;
            case MULTIPLY:
                new Multiply().execute(a,b);
                break;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
