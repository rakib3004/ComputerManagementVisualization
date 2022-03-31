package DesignPatternConcepts.ObserverPattern;

public class Main {
    public static void main(String args[]){

        Channel channel1 = new Channel(" Channel-1(Movie) ");
        Channel channel2 = new Channel(" Channel-2(Songs) ");

        Students Muktar = new Students(" Muktar ");
        Students Rakib = new Students(" Rakib ");
        Students Rahat = new Students(" Rahat ");
        Students Khairul = new Students(" Khairul ");

        channel1.subscribe(Muktar);
        channel1.subscribe(Rakib);
        channel2.subscribe(Rahat);
        channel2.subscribe(Khairul);

        System.out.println("\nChannel-1 and Channel-2 Uploaded first video ");
        channel1.videoUpload(" Movie-1 ");
        channel2.videoUpload(" song-1 ");
        channel1.unsubscribe(Rakib);
        channel2.unsubscribe(Khairul);

        System.out.println("\nChannel-1 and Channel-2 Uploaded 2nd video ");
        channel1.videoUpload(" movie-2 ");
        channel2.videoUpload(" song-2 ");

    }
}
