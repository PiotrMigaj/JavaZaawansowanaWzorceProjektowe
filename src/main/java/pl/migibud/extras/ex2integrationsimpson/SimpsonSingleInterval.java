package pl.migibud.extras.ex2integrationsimpson;

import java.util.function.Function;

public class SimpsonSingleInterval implements Integration{
    @Override
    public double integrate(Function<Double, Double> function, double a, double b) {
        return (b - a) / 6 * (function.apply(a)+4*function.apply((a+b)*0.5)+ function.apply(b));
    }
}
