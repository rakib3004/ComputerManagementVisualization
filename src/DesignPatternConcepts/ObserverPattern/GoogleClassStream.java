package DesignPatternConcepts.ObserverPattern;

import java.util.ArrayList;

public class GoogleClassStream {
    public static void main(String args[]){

        InitDataBase initDataBase = new InitDataBase();

        ArrayList<EducationalGoogleClassRoom> educationalGoogleClassRooms = initDataBase.initEducationalClassRoom();

        System.out.println("\nDay 1 Announcements: ");
        designPattern.postUploaded("Code Smells");
        webTechnology.postUploaded("Angular Framework");


        System.out.println("\nDay 2 Announcements: ");
        designPattern.postUploaded("Structural Design Pattern");
        webTechnology.postUploaded(".NET Framework");


    }


}
