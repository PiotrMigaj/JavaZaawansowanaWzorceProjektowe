package pl.migibud.wzorceprojektowe.zadania.observer.ex1;

public class Main {
    public static void main(String[] args) {

        DanePogodowe danePogodowe = new DanePogodowe();
        WarunkiBieżącyPanel warunkiBieżącyPanel = new WarunkiBieżącyPanel(danePogodowe);
        warunkiBieżącyPanel.wyswietl();

        danePogodowe.ustawOdczyty(26.6f,65f,1013.1f );


    }
}
