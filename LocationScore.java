public class LocationScore {

    private int score;
    private Location loc;

    public LocationScore(int score, Location loc) {
        this.score = score;
        this.loc = loc;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Location getLoc() {
        return loc;
    }

    public void setLoc(Location loc) {
        this.loc = loc;
    }
}
