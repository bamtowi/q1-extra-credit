package gitrep;

public class Singer {
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    private static int totalPerformances = 0;
    
    public Singer(String n){
        this.name = n;
        this.noOfPerformances = 0;
        this.earnings = 0.0;
    }

    public String getName() {
        return name;
    }

    public int getNoOfPerformances() {
        return noOfPerformances;
    }

    public double getEarnings() {
        return earnings;
    }

    public Song getFavoriteSong() {
        return favoriteSong;
    }

    public void setFavoriteSong(Song favoriteSong) {
        this.favoriteSong = favoriteSong;
    }
    
    public void changeFavSong(Song favoriteSong){
        this.setFavoriteSong(favoriteSong);
    }
    
    public static int getTotalPerformances(){
        return totalPerformances;
    }
    
    public void performForAudience(int people){
        noOfPerformances++;
        earnings += (people * 100);
        totalPerformances += getNoOfPerformances();
    }
    
    public void performForAudience(Singer otherSinger, int people){
        noOfPerformances++;
        earnings += (people * 100);
        totalPerformances += getNoOfPerformances();
    }
}
