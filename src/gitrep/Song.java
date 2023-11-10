package gitrep;

public class Song {
    String title;
    String artist;
    double minutes;
    int streams;
    
    public Song(String t, String a, double m, int s){
        title = t;
        artist = a;
        minutes = m;
        streams = s;
    }
    
    public void newStream(int scrobbles){
        streams += scrobbles;
    }
    
    public void newRemix(double time){
        minutes += time;
    }
}
