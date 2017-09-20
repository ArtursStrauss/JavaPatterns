package BehavioralDesignPattern.ObserverDesign.example2;

public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
