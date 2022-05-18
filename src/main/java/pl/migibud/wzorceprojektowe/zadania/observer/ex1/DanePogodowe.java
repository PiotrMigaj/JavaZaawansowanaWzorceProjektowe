package pl.migibud.wzorceprojektowe.zadania.observer.ex1;

import java.util.ArrayList;
import java.util.List;

public class DanePogodowe implements Podmiot{

    private List<Obserwator> obserwators;
    private float temperatura;
    private float wilgotnosc;
    private float cisnienie;

    public DanePogodowe() {
        this.obserwators = new ArrayList<>();
    }

    @Override
    public void zarejestrstrujObserwator(Obserwator o) {
        this.obserwators.add(o);
    }

    @Override
    public void usunObserwator(Obserwator o) {
        this.obserwators.remove(o);
    }

    @Override
    public void powiadomObserwator() {
        this.obserwators.forEach(o->o.aktualizacja());
    }

    private void zmienionoOdczyty(){
        powiadomObserwator();
    }

    public void ustawOdczyty(float temperatura, float wilgotnosc, float cisnienie){
        this.temperatura=temperatura;
        this.wilgotnosc=wilgotnosc;
        this.cisnienie=cisnienie;
        zmienionoOdczyty();
    }

    public float pobierzTemp() {
        return this.temperatura;
    }

    public float pobierzWilgo() {
        return this.wilgotnosc;
    }
}
