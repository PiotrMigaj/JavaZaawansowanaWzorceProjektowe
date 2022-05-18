package pl.migibud.wzorceprojektowe.zadania.decorator.exsda;

import java.util.List;

public interface StatisticsLogger {
    void displayStatistics();
    List<Double> getExecutionTimes();
}
