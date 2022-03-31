package DesignPatternConcepts.ObserverPattern;

public interface GoogleClassRoom {
    public void subscribe(GoogleClassRoomStudents googleClassRoomStudents);
    public void unsubscribe(GoogleClassRoomStudents googleClassRoomStudents);
    public void notifyObservers(String message);
}
