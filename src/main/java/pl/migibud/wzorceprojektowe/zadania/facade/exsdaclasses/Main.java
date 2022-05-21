package pl.migibud.wzorceprojektowe.zadania.facade.exsdaclasses;

public class Main {

    public static void main(String[] args) {

        ShapesDrawer shapesDrawer = new ShapesDrawer();
        String s = shapesDrawer.drawShapes();
        System.out.println(s);

    }

}
