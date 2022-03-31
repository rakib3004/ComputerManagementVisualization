package DesignPatternConcepts.ObserverPattern;

//subject
public interface GoogleClassRoom {
    public void subscribe(GoogleClassRoomStudents observer);
    public void unsubscribe(GoogleClassRoomStudents observer);
    public void notifyObservers(String message);
}
