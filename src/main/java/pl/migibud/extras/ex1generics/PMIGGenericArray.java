package pl.migibud.extras.ex1generics;

public class PMIGGenericArray {

    Object[] array = new Object[5];
    int iterator;

    public <T> void addObject(T t){
        array[iterator]=t;
        iterator++;
    }

    public <T> T getObj(int index){
        return (T)array[index];
    }


}
