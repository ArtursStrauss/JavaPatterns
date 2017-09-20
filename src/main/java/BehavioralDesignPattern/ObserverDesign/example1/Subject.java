package BehavioralDesignPattern.ObserverDesign.example1;

public interface Subject {

    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObservers();
}
