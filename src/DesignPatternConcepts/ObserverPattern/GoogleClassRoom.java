package DesignPatternConcepts.ObserverPattern;

public interface GoogleClassRoom {
    public void addToClassRoom(Students students);

    public void leftFromClassRoom(Students students);

    public void notifyStudents(String message);
}
