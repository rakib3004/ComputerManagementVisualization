package DesignPatternConcepts.ObserverPattern;

public class GoogleClassRoomStudents implements Students {

    private String studentName;

    public GoogleClassRoomStudents(String studentName) {
        this.studentName = studentName;
    }

    public void update(String classroomName, String postDetails) {
        System.out.println(studentName + ", there is a post for you from " + classroomName
                + ". Here is the details about post " + postDetails);
    }
}
