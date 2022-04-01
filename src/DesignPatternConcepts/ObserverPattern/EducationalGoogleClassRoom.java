package DesignPatternConcepts.ObserverPattern;

import java.util.ArrayList;

public class EducationalGoogleClassRoom implements GoogleClassRoom {

    private String classroomName;
    private ArrayList<Students> students;               // List of subscribers

    public EducationalGoogleClassRoom(String classroomName) {
        this.classroomName = classroomName;
        students = new ArrayList<Students>();
    }

    @Override
    public void subscribe(Students students) {

        this.students.add(students);
    }

    @Override
    public void unsubscribe(Students students) {

    }


    @Override
    public void notifyObservers(String videoName) {
        for (Students students : this.students)
            students.update(classroomName, videoName);
    }

    public void postUploaded(String videoName) {
        System.out.println(classroomName + "has uploaded" + videoName + "video on his channel");
        notifyObservers(videoName);
    }
}
