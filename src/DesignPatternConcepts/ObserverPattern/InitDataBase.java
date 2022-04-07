package DesignPatternConcepts.ObserverPattern;

import java.util.ArrayList;

public class InitDataBase {
    public ArrayList<GoogleClassRoomStudents> initGoogleClassRoomStudents() {
        GoogleClassRoomStudents bsse1101 = new GoogleClassRoomStudents("BSSE 1101");
        GoogleClassRoomStudents bsse1102 = new GoogleClassRoomStudents("BSSE 1102");
        GoogleClassRoomStudents bsse1103 = new GoogleClassRoomStudents("BSSE 1103");
        GoogleClassRoomStudents bsse1104 = new GoogleClassRoomStudents("BSSE 1104");
        GoogleClassRoomStudents bsse1105 = new GoogleClassRoomStudents("BSSE 1105");

        GoogleClassRoomStudents bsse1106 = new GoogleClassRoomStudents("BSSE 1106");
        GoogleClassRoomStudents bsse1107 = new GoogleClassRoomStudents("BSSE 1107");
        GoogleClassRoomStudents bsse1108 = new GoogleClassRoomStudents("BSSE 1108");
        GoogleClassRoomStudents bsse1109 = new GoogleClassRoomStudents("BSSE 1109");
        GoogleClassRoomStudents bsse1110 = new GoogleClassRoomStudents("BSSE 1110");

        GoogleClassRoomStudents bsse1111 = new GoogleClassRoomStudents("BSSE 1111");
        GoogleClassRoomStudents bsse1112 = new GoogleClassRoomStudents("BSSE 1112");
        GoogleClassRoomStudents bsse1113 = new GoogleClassRoomStudents("BSSE 1113");
        GoogleClassRoomStudents bsse1114 = new GoogleClassRoomStudents("BSSE 1114");
        GoogleClassRoomStudents bsse1115 = new GoogleClassRoomStudents("BSSE 1115");

        GoogleClassRoomStudents bsse1116 = new GoogleClassRoomStudents("BSSE 1116");
        GoogleClassRoomStudents bsse1117 = new GoogleClassRoomStudents("BSSE 1117");
        GoogleClassRoomStudents bsse1118 = new GoogleClassRoomStudents("BSSE 1118");
        GoogleClassRoomStudents bsse1119 = new GoogleClassRoomStudents("BSSE 1119");
        GoogleClassRoomStudents bsse1120 = new GoogleClassRoomStudents("BSSE 1120");

        GoogleClassRoomStudents bsse1121 = new GoogleClassRoomStudents("BSSE 1121");
        GoogleClassRoomStudents bsse1122 = new GoogleClassRoomStudents("BSSE 1122");
        GoogleClassRoomStudents bsse1123 = new GoogleClassRoomStudents("BSSE 1123");
        GoogleClassRoomStudents bsse1124 = new GoogleClassRoomStudents("BSSE 1125");
        GoogleClassRoomStudents bsse1125 = new GoogleClassRoomStudents("BSSE 1125");

        GoogleClassRoomStudents bsse1126 = new GoogleClassRoomStudents("BSSE 1126");
        GoogleClassRoomStudents bsse1127 = new GoogleClassRoomStudents("BSSE 1127");
        GoogleClassRoomStudents bsse1128 = new GoogleClassRoomStudents("BSSE 1128");
        GoogleClassRoomStudents bsse1129 = new GoogleClassRoomStudents("BSSE 1129");
        GoogleClassRoomStudents bsse1130 = new GoogleClassRoomStudents("BSSE 1130");

        ArrayList<GoogleClassRoomStudents> googleClassRoomStudents = new ArrayList<>();

        googleClassRoomStudents.add(bsse1101);
        googleClassRoomStudents.add(bsse1102);
        googleClassRoomStudents.add(bsse1103);
        googleClassRoomStudents.add(bsse1104);
        googleClassRoomStudents.add(bsse1105);
        googleClassRoomStudents.add(bsse1106);
        googleClassRoomStudents.add(bsse1107);
        googleClassRoomStudents.add(bsse1108);
        googleClassRoomStudents.add(bsse1109);
        googleClassRoomStudents.add(bsse1110);
        googleClassRoomStudents.add(bsse1111);
        googleClassRoomStudents.add(bsse1112);
        googleClassRoomStudents.add(bsse1113);
        googleClassRoomStudents.add(bsse1114);
        googleClassRoomStudents.add(bsse1115);
        googleClassRoomStudents.add(bsse1116);
        googleClassRoomStudents.add(bsse1117);
        googleClassRoomStudents.add(bsse1118);
        googleClassRoomStudents.add(bsse1119);
        googleClassRoomStudents.add(bsse1120);
        googleClassRoomStudents.add(bsse1121);
        googleClassRoomStudents.add(bsse1122);
        googleClassRoomStudents.add(bsse1123);
        googleClassRoomStudents.add(bsse1124);
        googleClassRoomStudents.add(bsse1125);
        googleClassRoomStudents.add(bsse1126);
        googleClassRoomStudents.add(bsse1127);
        googleClassRoomStudents.add(bsse1128);
        googleClassRoomStudents.add(bsse1129);
        googleClassRoomStudents.add(bsse1130);

        return googleClassRoomStudents;
    }

    public ArrayList<EducationalGoogleClassRoom> initEducationalClassRoom() {

        EducationalGoogleClassRoom designPattern = new EducationalGoogleClassRoom("Design Pattern");
        EducationalGoogleClassRoom webTechnology = new EducationalGoogleClassRoom("Web Technology");
        EducationalGoogleClassRoom databaseManagementSystemII = new EducationalGoogleClassRoom(
                "Database Management System II");
        EducationalGoogleClassRoom professionalEthics = new EducationalGoogleClassRoom("Professional Ethics");
        EducationalGoogleClassRoom softwareProjectLabII = new EducationalGoogleClassRoom("Software Project Lab II");
        EducationalGoogleClassRoom businessCommunications = new EducationalGoogleClassRoom("Business Communications");

        ArrayList<EducationalGoogleClassRoom> educationalGoogleClassRooms = new ArrayList<>();
        educationalGoogleClassRooms.add(designPattern);
        educationalGoogleClassRooms.add(webTechnology);
        educationalGoogleClassRooms.add(databaseManagementSystemII);
        educationalGoogleClassRooms.add(professionalEthics);
        educationalGoogleClassRooms.add(softwareProjectLabII);
        educationalGoogleClassRooms.add(businessCommunications);
        return educationalGoogleClassRooms;
    }
}
