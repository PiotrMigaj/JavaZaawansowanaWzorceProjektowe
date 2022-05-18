package pl.migibud.extras.ex2integrationsimpson;

import java.util.function.Function;

public class TrapezeSingleInterval implements Integration {
    @Override
    public double integrate(Function<Double, Double> function, double a, double b) {
        return 0.5 * (function.apply(a) + function.apply(b)) * (b - a);
    }
}
