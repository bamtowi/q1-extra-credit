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
        
        // Start
        Singer mySinger = new Singer("Megumi Acorda", 0, 0.00, song1);
        System.out.println("Artist: " + mySinger.name + "\nNumber of Performances: " + mySinger.noOfPerformances + "\nEarnings: " + mySinger.earnings + "\nFavorite Song: " + mySinger.favoriteSong);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        // Megumi Acorda performs
        mySinger.performForAudience(12);
        System.out.println(mySinger.name + " performed for an audience of 12. The concert was opened by " + artist3.name + ".");
        mySinger.changeFavSong(song2);
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~\nArtist: " + mySinger.name + "\nNumber of Performances: " + mySinger.noOfPerformances + "\nEarnings: " + mySinger.earnings + "\nFavorite Song: " + mySinger.favoriteSong);
        
        // The other classes interact
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~\n~~~~~~~~~~~~~~~~~~~~~~~~~\n" + song1.title + " No. of Streams: " + song1.streams + "\nLength: " + song1.minutes);
        song1.newStream(3);
        song1.newRemix(1.03);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~\n" + artist2.name + " listened to " + song1.title + " 3 times.\n" + artist1.name + " released a remix of " + song1.title + " that is 1.03 minutes longer.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~\n" + song1.title + " No. of Streams: " + song1.streams + "\nLength: " + song1.minutes);
        
    }
    
}
