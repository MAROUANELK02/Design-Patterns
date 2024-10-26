package observer.cours;

public interface Observable {
    public void addObserver(Observer o);
    public void removeObsever(Observer o);
    public void notifyObservers();
}
