package DesignPatternConcepts.ObserverPattern;

public class Students implements GoogleClassRoomStudents {

    private String subscriberName;

    public Students(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public void update(String classroomName, String postDetails) {
        System.out.println(subscriberName + "you have to see an amazing video by" + classroomName + "whose video's name is" + postDetails);
    }
}
