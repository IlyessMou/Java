import java.util.HashMap;

public class Map_of_the_Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<>();
        //+ songs 
        trackList.put("Bohemian Rhapsody", "Is this the real life? Is this just fantasy?");
        trackList.put("Hotel California", "You can check out anytime you like, but you can never leave.");
        trackList.put("Imagine", "Imagine all the people living life in peace.");
        trackList.put("The Greatest", "You said your heart was jaded.");

        // test for pulling out lyrics by song title
        String lyrics = trackList.get("Imagine");
        System.out.println("Lyrics for Imagine : " + lyrics);

        // Printing all tracks with their lyrics
        System.out.println("\nAll Tracks:");
        for (String track : trackList.keySet()) {
            System.out.println(track + ": " + trackList.get(track));
        }
    }
}