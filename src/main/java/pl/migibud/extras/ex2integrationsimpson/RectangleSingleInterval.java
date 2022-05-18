package pl.migibud.extras.ex2integrationsimpson;

import java.util.function.Function;

public class RectangleSingleInterval implements Integration{
    @Override
    public double integrate(Function<Double, Double> function, double a, double b) {
        return function.apply(b)*(b-a);
    }
}
