package pl.migibud.wzorceprojektowe.zadania.flyweight.ex2;

public class SpaceShip {

    private String name;
    private int positionX;
    private int positionY;

    public SpaceShip(String name) {
        this.name = name;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public void display(){
        System.out.println("Statek kosmiczny: " + name + " ,znajduje się na pozycji x,y: "+positionX+ " "+positionY);
    }
}
