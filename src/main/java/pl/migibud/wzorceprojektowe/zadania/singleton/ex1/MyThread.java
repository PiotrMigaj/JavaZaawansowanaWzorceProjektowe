package pl.migibud.wzorceprojektowe.zadania.singleton.ex1;

public class MyThread implements Runnable{
    @Override
    public void run() {
        GameEngine gameEngine = null;
        try {
            gameEngine = GameEngine.getInstance();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " " + gameEngine.hashCode());
    }
}
