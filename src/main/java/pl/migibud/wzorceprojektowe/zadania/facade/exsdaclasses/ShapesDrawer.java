package pl.migibud.wzorceprojektowe.zadania.facade.exsdaclasses;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ShapesDrawer {

    private Shape circle;
    private Shape square;
    private Shape rectangle;

    public ShapesDrawer() {
        circle = new Circle();
        square = new Square();
        rectangle = new Rectangle();
    }

    public String drawCircle(){
        return circle.draw();
    }

    public String drawSquare(){
        return square.draw();
    }


    public String drawRectangle(){
        return rectangle.draw();
    }

    public String drawShapes(){
        return String.join(" , ", circle.draw(), square.draw(),rectangle.draw());
    }

}
