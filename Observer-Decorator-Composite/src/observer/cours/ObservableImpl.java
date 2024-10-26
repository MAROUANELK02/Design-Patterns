package observer.cours;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
    private List<Observer> observers=new ArrayList<>();
    private int etat;
    @Override
    public void addObserver(Observer o) { observers.add(o); }
    @Override
    public void removeObsever(Observer o) { observers.remove(o); }
    @Override
    public void notifyObservers() {
        for(Observer o:observers){ o.update(this); }
    }
    public int getEtat() { return etat; }
    public void setEtat(int etat) { this.etat = etat; notifyObservers();}

}
