package pl.migibud.wzorceprojektowe.zadania.observer.ex1;

public interface Podmiot {

    void zarejestrstrujObserwator(Obserwator o);
    void usunObserwator(Obserwator o);
    void powiadomObserwator();

}
