package gitrep;

public class GitRep {

    public static void main(String[] args) {
        // Custom class
        Artist artist1 = new Artist("Radiohead", "Alt Rock", 38, 4.28);
        Artist artist2 = new Artist("Fiona Apple", "Alt Pop", 27, 4.01);
        Artist artist3 = new Artist("TXT", "KPop", 4, 3.47);
        
        // Song class
        Song song1 = new Song("40 Days", "Slowdive", 3.22, 38);
        Song song2 = new Song("Aftershow", "Megumi Acorda", 5.03, 79);
        
        // Singer class
        Singer mySinger = new Singer("Megumi Acorda");
        mySinger.setFavoriteSong(song1);
        
        // Megumi Acorda performs
        mySinger.performForAudience(12);
        mySinger.changeFavSong(song2);
        
        // Others
        Singer yourSinger = new Singer("Ena Mori");
        mySinger.performForAudience(yourSinger, 24);
        song1.newStream(3);
        song1.newRemix(1.03);
    }
    
}
