package pl.migibud.wzorceprojektowe.zadania.decorator.exsda;

import java.util.List;
import java.util.OptionalDouble;

public class WithMeanStatisticsLogger extends StatisticsDecorator{
    public WithMeanStatisticsLogger(StatisticsLogger statisticsLogger) {
        super(statisticsLogger);
    }

    @Override
    public void displayStatistics() {
        Double average = this.statisticsLogger.getExecutionTimes().stream().mapToDouble(v->v).average().getAsDouble();
        System.out.println("Wartość średnia: "+average);
        this.statisticsLogger.displayStatistics();
    }

    @Override
    public List<Double> getExecutionTimes() {
        return this.statisticsLogger.getExecutionTimes();
    }
}
