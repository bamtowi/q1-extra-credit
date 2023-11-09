package gitrep;

public class GitRep {

    public static void main(String[] args) {
        // Objects
        String artist1 = "Radiohead";
        String genre1 = "Alt Rock";
        int yrs1 = 38;
        double rate1 = 4.28;
        System.out.println("Artist 1\n Name: " + artist1 + "\n Genre: " + genre1 + "\n Years active: " + yrs1 + "\n Highest Album Rating: " + rate1 + "\n~~~~~~~~~~~~~~~~~~~~");
        
        String artist2 = "Fiona Apple";
        String genre2 = "Alt Pop";
        int yrs2 = 27;
        double rate2 = 4.01;
        System.out.println("Artist 2\n Name: " + artist2 + "\n Genre: " + genre2 + "\n Years active: " + yrs2 + "\n Highest Album Rating: " + rate2 + "\n~~~~~~~~~~~~~~~~~~~~");
        
        String artist3 = "TXT";
        String genre3 = "KPop";
        int yrs3 = 4;
        double rate3 = 3.47;
        System.out.println("Artist 3\n Name: " + artist3 + "\n Genre: " + genre3 + "\n Years active: " + yrs3 + "\n Highest Album Rating: " + rate3 + "\n~~~~~~~~~~~~~~~~~~~~");
        
        // Comparison
        int active = yrs1 + yrs2 + yrs3;
        System.out.println("Total years active: " + active);
      
        boolean years = yrs2>=yrs1;
        System.out.println(artist2 + " has been active for more years than " + artist1 + ": " + years);
      
        boolean genre = genre2.equals(genre3);
        System.out.println(artist3 + " and " + artist2 + " have the same genre: " + genre);
        
        boolean rate = rate1>=rate3;
        System.out.println(artist1 + " has a higher album rating than " + artist3 + ": " + rate);
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~\n*Ratings via rateyourmusic.com");
    }
    
}
