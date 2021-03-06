package pl.migibud.extras.ex2integrationsimpson;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        long start, stop;
        start = System.currentTimeMillis();
        double result = MigiMath.integrate(new SimpsonSingleInterval(),0,3,x->x*x);
        stop = System.currentTimeMillis();

        System.out.println(result);
        System.out.println(stop-start);

        System.out.println();

        Integration integration = new SimpsonSingleInterval();
        double result2 = integration.integrate(x->x*x,0,3);
        System.out.println(result2);


//
//        start = System.currentTimeMillis();
//        result = MigiMath.multiThreadRectangleIntegrate(x->x*x,0,3);
//        stop = System.currentTimeMillis();
//
//        System.out.println(result);
//        System.out.println(stop-start);
    }
}
