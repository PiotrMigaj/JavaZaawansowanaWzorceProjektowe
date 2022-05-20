package pl.migibud.wzorceprojektowe.zadania.decorator.ex5;

public abstract class PlayerDecorator {

    protected Character character;

    public PlayerDecorator(Character character) {
        this.character = character;
    }
    public abstract void playerSummary();
}
