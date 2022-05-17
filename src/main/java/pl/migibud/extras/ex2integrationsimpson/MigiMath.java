package pl.migibud.extras.ex2integrationsimpson;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.DoubleAdder;
import java.util.function.Function;

public class MigiMath {

    private static final int NUMBER_OF_DIVISION = 10_000_000;

    public static double multiThreadRectangleIntegrate(Function<Double, Double> function, double a, double b) throws InterruptedException {

        double result = 0;

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        DoubleAdder adder = new DoubleAdder();
        executorService.submit(() -> adder.add(rectangleIntegrate(function,a,(b-a)*0.5)));
        executorService.submit(() -> adder.add(rectangleIntegrate(function,(b-a)*0.5,b)));
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);
        result = adder.sum();
        return result;
    }

    public static double rectangleIntegrate(Function<Double, Double> function, double a, double b) {
        double sum=0;
        double lengthOfInterval = (b-a)/NUMBER_OF_DIVISION;
        for (int i=0;i<NUMBER_OF_DIVISION;i++){
            double startOfInterval = a+i*lengthOfInterval;
            double endOfInterval = startOfInterval+lengthOfInterval;
            sum+= rectangleSingleInterval(function,startOfInterval,endOfInterval);
        }
        return sum;
    }

    public static double rectangleSingleInterval(Function<Double, Double> function, double a, double b) {
//        return (b - a) / 6 * (function.apply(a)+4*function.apply((a+b)*0.5)+ function.apply(b));
        return function.apply(b)*(b-a);
    }

}
