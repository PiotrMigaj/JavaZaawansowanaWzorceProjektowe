package pl.migibud.wzorceprojektowe.zadania.decorator.exsda;

import java.util.List;

public class ExecutionTimesBaseStatistics implements StatisticsLogger{

    private final List<Double> executionTimes;

    public ExecutionTimesBaseStatistics(List<Double> executionTimes) {
        this.executionTimes = executionTimes;
    }

    @Override
    public void displayStatistics() {
        final StringBuilder stringBuilder = new StringBuilder();
        executionTimes.stream().forEach(v->stringBuilder.append("Execution time: ").append(v).append("\n"));
        System.out.println(stringBuilder.toString());
    }

    @Override
    public List<Double> getExecutionTimes() {
        return this.executionTimes;
    }
}
