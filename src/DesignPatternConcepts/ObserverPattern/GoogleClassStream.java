package DesignPatternConcepts.ObserverPattern;

public class GoogleClassStream {
    public static void main(String args[]){

        EducationalGoogleClassRoom designPattern = new EducationalGoogleClassRoom("Design Pattern");
        EducationalGoogleClassRoom webTechnology = new EducationalGoogleClassRoom("Web Technology");


        GoogleClassRoomStudents bsse1129 = new GoogleClassRoomStudents("BSSE 1129");
        GoogleClassRoomStudents bsse1101 = new GoogleClassRoomStudents("BSSE 1101");
        GoogleClassRoomStudents bsse1116 = new GoogleClassRoomStudents(" BSSE 1116");
        GoogleClassRoomStudents bsse1110 = new GoogleClassRoomStudents(" BSSE 1110");
        GoogleClassRoomStudents bsse1109 = new GoogleClassRoomStudents(" BSSE 1109");

        designPattern.subscribe(bsse1129);
        designPattern.subscribe(bsse1116);
        webTechnology.subscribe(bsse1110);
        webTechnology.subscribe(bsse1109);
        designPattern.subscribe(bsse1101);
        webTechnology.subscribe(bsse1101);

        System.out.println("\nDay 1 Announcements: ");
        designPattern.postUploaded("Code Smells");
        webTechnology.postUploaded("Angular Framework");
        designPattern.unsubscribe(bsse1116);
        webTechnology.unsubscribe(bsse1109);

        System.out.println("\nDay 2 Annoucements: ");
        designPattern.postUploaded("Structural Design Pattern");
        webTechnology.postUploaded(".NET Framework");



    }
}
