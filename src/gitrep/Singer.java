package gitrep;

public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    
    public Singer(String n, int p, double e, Song f){
        name = n;
        noOfPerformances = p;
        earnings = e;
        favoriteSong = f;
    }
    
    public void performForAudience(int people){
        noOfPerformances += 1;
        earnings += people * 100;
    }
    
    public void changeFavSong(Song song){
        favoriteSong = song;
    }
}
