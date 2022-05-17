package pl.migibud.wzorceprojektowe.zadania.singleton.ex1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        Thread thread1 = new Thread(()->{
            GameEngine gameEngine1 = null;
            try {
                gameEngine1 = GameEngine.getInstance();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            gameEngine1.setCharacterName("Piotr");
            System.out.println(gameEngine1.getCharacterName());
            try {
                Thread.sleep(2000);
                System.out.println(gameEngine1.getCharacterName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(()->{
            GameEngine gameEngine2 = null;
            try {
                gameEngine2 = GameEngine.getInstance();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            gameEngine2.setCharacterName("Basia");
            System.out.println(gameEngine2.getCharacterName());
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println();

//        ExecutorService executorService = null;
//        MyThread myThread = new MyThread();

//        try{
//            executorService = Executors.newFixedThreadPool(3);
//            executorService.execute(myThread);
//            executorService.execute(myThread);
//            executorService.execute(myThread);
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            if (executorService!=null){
//                executorService.shutdown();
//            }
//        }


    }
}
