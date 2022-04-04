package DesignPatternConcepts.ObserverPattern;

public class GoogleClassStream {
    public static void main(String args[]){

        EducationalGoogleClassRoom designPattern = new EducationalGoogleClassRoom("Design Pattern");
        EducationalGoogleClassRoom webTechnology = new EducationalGoogleClassRoom("Web Technology");
        EducationalGoogleClassRoom databaseManagementSystemII = new EducationalGoogleClassRoom("Database Management System II");
        EducationalGoogleClassRoom professionalEthics = new EducationalGoogleClassRoom("Professional Ethics");
        EducationalGoogleClassRoom softwareProjectLabII = new EducationalGoogleClassRoom("Software Project Lab II");
        EducationalGoogleClassRoom businessCommunications = new EducationalGoogleClassRoom("Business Communications");



        GoogleClassRoomStudents bsse1111 = new GoogleClassRoomStudents("BSSE 1101");
        GoogleClassRoomStudents bsse1105 = new GoogleClassRoomStudents("BSSE 1102");
        GoogleClassRoomStudents bsse1128 = new GoogleClassRoomStudents("BSSE 1103");
        GoogleClassRoomStudents bsse1125 = new GoogleClassRoomStudents("BSSE 1104");
        GoogleClassRoomStudents bsse1115 = new GoogleClassRoomStudents("BSSE 1105");


        GoogleClassRoomStudents bsse1129 = new GoogleClassRoomStudents("BSSE 1106");
        GoogleClassRoomStudents bsse1101 = new GoogleClassRoomStudents("BSSE 1107");
        GoogleClassRoomStudents bsse1114 = new GoogleClassRoomStudents("BSSE 1108");
        GoogleClassRoomStudents bsse1110 = new GoogleClassRoomStudents("BSSE 1109");
        GoogleClassRoomStudents bsse1109 = new GoogleClassRoomStudents("BSSE 1110");

        GoogleClassRoomStudents bsse1111 = new GoogleClassRoomStudents("BSSE 1111");
        GoogleClassRoomStudents bsse1105 = new GoogleClassRoomStudents("BSSE 1112");
        GoogleClassRoomStudents bsse1128 = new GoogleClassRoomStudents("BSSE 1113");
        GoogleClassRoomStudents bsse1125 = new GoogleClassRoomStudents("BSSE 1114");
        GoogleClassRoomStudents bsse1115 = new GoogleClassRoomStudents("BSSE 1115");


        GoogleClassRoomStudents bsse1129 = new GoogleClassRoomStudents("BSSE 1129");
        GoogleClassRoomStudents bsse1101 = new GoogleClassRoomStudents("BSSE 1101");
        GoogleClassRoomStudents bsse1114 = new GoogleClassRoomStudents("BSSE 1114");
        GoogleClassRoomStudents bsse1110 = new GoogleClassRoomStudents("BSSE 1110");
        GoogleClassRoomStudents bsse1109 = new GoogleClassRoomStudents("BSSE 1109");

        GoogleClassRoomStudents bsse1116 = new GoogleClassRoomStudents("BSSE 1116");
        GoogleClassRoomStudents bsse1105 = new GoogleClassRoomStudents("BSSE 1105");
        GoogleClassRoomStudents bsse1128 = new GoogleClassRoomStudents("BSSE 1128");
        GoogleClassRoomStudents bsse1125 = new GoogleClassRoomStudents("BSSE 1125");
        GoogleClassRoomStudents bsse1115 = new GoogleClassRoomStudents("BSSE 1115");


        GoogleClassRoomStudents bsse1129 = new GoogleClassRoomStudents("BSSE 1129");
        GoogleClassRoomStudents bsse1101 = new GoogleClassRoomStudents("BSSE 1101");
        GoogleClassRoomStudents bsse1114 = new GoogleClassRoomStudents("BSSE 1114");
        GoogleClassRoomStudents bsse1110 = new GoogleClassRoomStudents("BSSE 1110");
        GoogleClassRoomStudents bsse1109 = new GoogleClassRoomStudents("BSSE 1109");




        designPattern.subscribe(bsse1129);
        designPattern.subscribe(bsse1114);
        webTechnology.subscribe(bsse1110);
        webTechnology.subscribe(bsse1109);
        designPattern.subscribe(bsse1101);
        webTechnology.subscribe(bsse1101);

        System.out.println("\nDay 1 Announcements: ");
        designPattern.postUploaded("Code Smells");
        webTechnology.postUploaded("Angular Framework");
        designPattern.unsubscribe(bsse1114);
        webTechnology.unsubscribe(bsse1109);

        System.out.println("\nDay 2 Announcements: ");
        designPattern.postUploaded("Structural Design Pattern");
        webTechnology.postUploaded(".NET Framework");



    }
}
