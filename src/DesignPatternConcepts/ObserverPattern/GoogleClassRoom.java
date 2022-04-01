package DesignPatternConcepts.ObserverPattern;

public interface GoogleClassRoom {
    public void subscribe(Students students);
    public void unsubscribe(Students students);
    public void notifyObservers(String message);
}
