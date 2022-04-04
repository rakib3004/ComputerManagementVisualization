package DesignPatternConcepts.ObserverPattern;

public class GoogleClassRoomStudents implements Students {

    private String subscriberName;

    public GoogleClassRoomStudents(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public void update(String classroomName, String postDetails) {
        System.out.println(subscriberName + ", there is a post for you from" + classroomName + "Here is the details about post" + postDetails);
    }
}
