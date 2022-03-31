package DesignPatternConcepts.ObserverPattern;

//subject
public interface GoogleClassRoom {
    public void subscribe(GoogleClassRoomStudents googleClassRoomStudents);
    public void unsubscribe(GoogleClassRoomStudents googleClassRoomStudents);
    public void notifyObservers(String message);
}
