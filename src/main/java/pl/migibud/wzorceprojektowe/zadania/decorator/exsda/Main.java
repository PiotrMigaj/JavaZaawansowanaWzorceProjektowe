package pl.migibud.wzorceprojektowe.zadania.decorator.exsda;

import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        StatisticsLogger statisticsLogger = new ExecutionTimesBaseStatistics(List.of(1.1,2.3,4.5,6.7));
        statisticsLogger.displayStatistics();
        System.out.println();
        StatisticsLogger statisticsLogger1 = new WithMeanStatisticsLogger(statisticsLogger);
        statisticsLogger1.displayStatistics();
        System.out.println();
        StatisticsLogger statisticsLogger2 = new WithSummaryStatisticsLogger(statisticsLogger1);
        statisticsLogger2.displayStatistics();


//        List<Double> myList = List.of(2.0,3.0);
//        System.out.println(myList.stream().mapToDouble(v->v).average().getAsDouble());



    }
}
