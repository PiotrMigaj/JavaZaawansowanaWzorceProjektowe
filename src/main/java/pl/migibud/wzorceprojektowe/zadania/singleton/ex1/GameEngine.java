package pl.migibud.wzorceprojektowe.zadania.singleton.ex1;

import java.io.Serializable;

public class GameEngine implements Serializable {

    private int hp = 100;
    private String characterName = "";

    private static GameEngine instance;

    private GameEngine(){}

    public static GameEngine getInstance() throws InterruptedException {
        if (instance==null){
            synchronized (GameEngine.class){
                if (instance==null){
                    Thread.sleep(2000);
                    instance = new GameEngine();
                }
            }
//            Thread.sleep(2000);
//            instance = new GameEngine();
        }
        return instance;
    }

    public void run(){
        while(true){

        }
    }


    //Zabezpiecza przed serializacją
    protected Object getResolve() throws InterruptedException {
        return getInstance();
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
}
