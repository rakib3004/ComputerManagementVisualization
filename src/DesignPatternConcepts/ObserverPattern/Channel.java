package DesignPatternConcepts.ObserverPattern;

import java.util.ArrayList;

public class Channel implements GoogleClassRoom {

    private String channelName;
    private ArrayList<GoogleClassRoomStudents> googleClassRoomStudents;               // List of subscribers

    public Channel(String channelName) {
        this.channelName = channelName;
        googleClassRoomStudents = new ArrayList<GoogleClassRoomStudents>();
    }

    @Override
    public void subscribe(GoogleClassRoomStudents googleClassRoomStudents) {

        this.googleClassRoomStudents.add(googleClassRoomStudents);
    }

    @Override
    public void unsubscribe(Students user) {

        googleClassRoomStudents.remove(user);
    }

    @Override
    public void notifyObservers(String videoName) {
        for (GoogleClassRoomStudents googleClassRoomStudents : googleClassRoomStudents)
            googleClassRoomStudents.update(channelName, videoName);
    }

    public void videoUpload(String videoName) {
        System.out.println(channelName + "has uploaded" + videoName + "video on his channel");
        notifyObservers(videoName);
    }
}
