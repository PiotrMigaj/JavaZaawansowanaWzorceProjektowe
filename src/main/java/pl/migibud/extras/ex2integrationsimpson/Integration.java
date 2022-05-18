package pl.migibud.extras.ex2integrationsimpson;

import java.util.function.Function;

public interface Integration {
    double integrate(Function<Double, Double> function, double a, double b);
}
