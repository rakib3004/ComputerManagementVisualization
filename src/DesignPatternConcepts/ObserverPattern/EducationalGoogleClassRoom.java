package DesignPatternConcepts.ObserverPattern;

import java.util.ArrayList;

public class EducationalGoogleClassRoom implements GoogleClassRoom {

    private String classroomName;
    private ArrayList<Students> students;

    public EducationalGoogleClassRoom(String classroomName) {
        this.classroomName = classroomName;
        students = new ArrayList<Students>();

    }

    @Override
    public void addToClassRoom(Students students) {

        this.students.add(students);
    }

    @Override
    public void leftFromClassRoom(Students students) {
        this.students.remove(students);
    }

    @Override
    public void notifyStudents(String postName) {
        for (Students students : this.students)
            students.update(classroomName, postName);
    }

    public void postUploaded(String postName) {
        System.out.println(classroomName + " has posted " + postName + " post on this classroom");
        notifyStudents(postName);
    }
}
