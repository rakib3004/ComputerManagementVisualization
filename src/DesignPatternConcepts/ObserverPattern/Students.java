package DesignPatternConcepts.ObserverPattern;

public class Students implements GoogleClassRoomStudents {

    private String subscriberName;

    public Students(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public void update(String youtuberName, String videoName) {
        System.out.println(subscriberName + "you have to see an amazing video by" + youtuberName + "whose video's name is" + videoName);
    }
}
