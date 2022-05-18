package pl.migibud.wzorceprojektowe.zadania.decorator.exsda;

import java.util.List;

public abstract class StatisticsDecorator implements StatisticsLogger {

    StatisticsLogger statisticsLogger;

    public StatisticsDecorator(StatisticsLogger statisticsLogger) {
        this.statisticsLogger = statisticsLogger;
    }

    @Override
    public void displayStatistics() {
        this.statisticsLogger.displayStatistics();
    }

    @Override
    public List<Double> getExecutionTimes() {
        return this.statisticsLogger.getExecutionTimes();
    }
}
