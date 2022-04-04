package DesignPatternConcepts.ObserverPattern;

public class Main {
    public static void main(String args[]){

        EducationalGoogleClassRoom designPattern = new EducationalGoogleClassRoom("Design Pattern");
        EducationalGoogleClassRoom webTechnology = new EducationalGoogleClassRoom("Web Technology");

        Students Muktar = new Students(" Muktar");
        Students Rakib = new Students(" Rakib");
        Students Rahat = new Students(" Rahat");
        Students Khairul = new Students(" Khairul");

        designPattern.subscribe(Muktar);
        designPattern.subscribe(Rakib);
        webTechnology.subscribe(Rahat);
        webTechnology.subscribe(Khairul);

        System.out.println("\nDay 1 Announcements: ");
        designPattern.postUploaded("Code Smells");
        webTechnology.postUploaded("Angular Framework");
        designPattern.unsubscribe(Rakib);
        webTechnology.unsubscribe(Khairul);

        System.out.println("\nDay 2 Annoucements: ");
        designPattern.postUploaded("Structural Design Pattern");
        webTechnology.postUploaded(".NET Framework");

    }
}
