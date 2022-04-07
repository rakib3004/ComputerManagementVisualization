package DesignPatternConcepts.ObserverPattern;

import java.util.ArrayList;

public class GoogleClassStream {
    public static void main(String args[]) {

        InitDataBase initDataBase = new InitDataBase();

        ArrayList<EducationalGoogleClassRoom> educationalGoogleClassRooms = initDataBase.initEducationalClassRoom();
        ArrayList<GoogleClassRoomStudents> googleClassRoomStudents = initDataBase.initGoogleClassRoomStudents();

        int firstClassIndex, lastClassIndex, firstStudentIndex, lastStudentIndex;
        firstClassIndex = 0;
        lastClassIndex = 5;
        firstStudentIndex = 0;
        lastStudentIndex = 29;
        int steamLength = 30;
        int unsubscribeList = 20;
        for (int i = 0; i < steamLength; i++) {

            int theClassIndex = (int) ((Math.random() * (lastClassIndex - firstClassIndex)) + firstClassIndex);
            int theStudentIndex = (int) ((Math.random() * (lastStudentIndex - firstStudentIndex)) + firstStudentIndex);
            educationalGoogleClassRooms.get(theClassIndex).addToClassRoom(googleClassRoomStudents.get(theStudentIndex));
        }
        ArrayList<String> dayOne = new ArrayList<>();
        dayOne.add("Builder Pattern");
        dayOne.add(".NET Framework");
        dayOne.add("File System");
        dayOne.add("IT workers Ethics");
        dayOne.add("Init Project");
        dayOne.add("Communications Culture");

        for (int i = 0; i <= lastClassIndex; i++) {
            educationalGoogleClassRooms.get(i).postUploaded(dayOne.get(i));
            System.out.println();
            System.out.println();
        }

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("After Semester Ended There Are Many Students Are Out Of Class: ");
        System.out.println("-----------------------------------------------------------------------");

        for (int i = 0; i < unsubscribeList; i++) {

            int theClassIndex = (int) ((Math.random() * (lastClassIndex - firstClassIndex)) + firstClassIndex);
            int theStudentIndex = (int) ((Math.random() * (lastStudentIndex - firstStudentIndex)) + firstStudentIndex);
            educationalGoogleClassRooms.get(theClassIndex)
                    .leftFromClassRoom(googleClassRoomStudents.get(theStudentIndex));

        }

        ArrayList<String> dayTwo = new ArrayList<>();
        dayTwo.add("Abstract Pattern");
        dayTwo.add("Angular Framework");
        dayTwo.add("Decision Tree");
        dayTwo.add("Software Privacy");
        dayTwo.add("Mid Term Check Up");
        dayTwo.add("Business Report Writing");

        for (int i = 0; i <= lastClassIndex; i++) {
            educationalGoogleClassRooms.get(i).postUploaded(dayTwo.get(i));
            System.out.println();
            System.out.println();
        }
    }

}
