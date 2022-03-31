package DesignPatternConcepts.ObserverPattern;

public class Students implements GoogleClassRoomStudents {

    private String subscriberName;

    public Students(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public void update(String classroomName, String postDetails) {
        System.out.println(subscriberName + ", there is a post for you from" + classroomName + "Here is the details" + postDetails);
    }
}
