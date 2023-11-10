package gitrep;

public class Artist {
    private String name;
    private String genre;
    private int yrs;
    private double rate;
    
    public Artist(String n, String g, int y, double r){
        this.name = n;
        this.genre = g;
        this.yrs = y;
        this.rate = r;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYrs() {
        return yrs;
    }

    public void setYrs(int yrs) {
        this.yrs = yrs;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
