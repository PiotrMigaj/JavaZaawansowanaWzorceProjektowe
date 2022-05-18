package pl.migibud.wzorceprojektowe.zadania.decorator.exsda;

import java.util.List;

public class WithSummaryStatisticsLogger extends StatisticsDecorator{

    public WithSummaryStatisticsLogger(StatisticsLogger statisticsLogger) {
        super(statisticsLogger);
    }

    @Override
    public void displayStatistics() {
        System.out.println(("Ilość rekordów: "+this.statisticsLogger.getExecutionTimes().size()));
        System.out.println("Suma: " + this.statisticsLogger.getExecutionTimes().stream().mapToDouble(v->v).sum());
        System.out.println("Min value: " + this.statisticsLogger.getExecutionTimes().stream().mapToDouble(v->v).min().getAsDouble());
        System.out.println("Max value: " + this.statisticsLogger.getExecutionTimes().stream().mapToDouble(v->v).max().getAsDouble());
        this.statisticsLogger.displayStatistics();
    }

    @Override
    public List<Double> getExecutionTimes() {
        return this.statisticsLogger.getExecutionTimes();
    }
}
