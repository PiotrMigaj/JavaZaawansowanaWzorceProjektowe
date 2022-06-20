package pl.migibud.wzorceprojektowe.zadania.memento.ex1;

public class Originator {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Memento save(){
        return new Memento(state);
    }

    public void restore(Memento memento){
        this.state = memento.getState();
    }
}
