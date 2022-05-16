package pl.migibud.wzorceprojektowe.zadania.prototype.ex1;

public abstract class Shape {

    int width;
    int height;

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public abstract void draw();
    public abstract Shape cloneObject();
}
