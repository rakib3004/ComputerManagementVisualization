package DesignPatternConcepts.ObserverPattern;

import java.util.ArrayList;

public class EducationalGoogleClassRoom implements GoogleClassRoom {

    private String classroomName;
    private ArrayList<GoogleClassRoomStudents> googleClassRoomStudents;               // List of subscribers

    public EducationalGoogleClassRoom(String classroomName) {
        this.classroomName = classroomName;
        googleClassRoomStudents = new ArrayList<GoogleClassRoomStudents>();
    }

    @Override
    public void subscribe(GoogleClassRoomStudents googleClassRoomStudents) {

        this.googleClassRoomStudents.add(googleClassRoomStudents);
    }

    @Override
    public void unsubscribe(GoogleClassRoomStudents googleClassRoomStudents) {

    }


    @Override
    public void notifyObservers(String videoName) {
        for (GoogleClassRoomStudents googleClassRoomStudents : googleClassRoomStudents)
            googleClassRoomStudents.update(classroomName, videoName);
    }

    public void postUploaded(String videoName) {
        System.out.println(classroomName + "has uploaded" + videoName + "video on his channel");
        notifyObservers(videoName);
    }
}
