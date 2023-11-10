package gitrep;

public class Song {
    private String title;
    private String artist;
    private double minutes;
    private int streams;
    
    public Song(String t, String a, double m, int s){
        this.title = t;
        this.artist = a;
        this.minutes = m;
        this.streams = s;
    }
    
    public void newStream(int scrobbles){
        setStreams(getStreams() + scrobbles);
    }
    
    public void newRemix(double time){
        setMinutes(getMinutes() + time);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getMinutes() {
        return minutes;
    }

    public void setMinutes(double minutes) {
        this.minutes = minutes;
    }

    public int getStreams() {
        return streams;
    }

    public void setStreams(int streams) {
        this.streams = streams;
    }
}
