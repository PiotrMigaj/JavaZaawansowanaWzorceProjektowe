package pl.migibud.wzorceprojektowe.zadania.memento.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CareTaker {

    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }

    public List<State> getAllStates(){
        return mementoList.stream()
                .map(v->v.getState())
                .collect(Collectors.toUnmodifiableList());
    }

}
