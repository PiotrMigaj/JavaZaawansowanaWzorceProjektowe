package pl.migibud.wzorceprojektowe.zadania.observer.ex1;

public class WarunkiBieżącyPanel implements Obserwator,PanelInformacyjny{

    private float temperatura;
    private float wilgotnosc;
    private DanePogodowe danePogodowe;

    public WarunkiBieżącyPanel(DanePogodowe danePogodowe) {
        this.danePogodowe = danePogodowe;
        this.danePogodowe.zarejestrstrujObserwator(this);
    }

    @Override
    public void aktualizacja() {
        this.temperatura=danePogodowe.pobierzTemp();
        this.wilgotnosc=danePogodowe.pobierzWilgo();
        wyswietl();
    }

    @Override
    public void wyswietl() {
        System.out.println("Warunki bieżące: " + temperatura + " stopni C oraz " + wilgotnosc + "% wilgotność");
    }
}
