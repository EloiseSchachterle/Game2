import java.util.Scanner;

public class Level {
    private boolean goalReached;
    private int points;

    /**
     * retur true if the player reached the goal on this level
     * and return false if otherwise
     */
    public boolean goalReached(){
        return goalReached;
    }
    public void reachGoal(){
        goalReached = true;
    }

    /** Returns the numnber of points (a positive integer) recorded for this level*/
    public int getpoints() {
        return points;
    }
    public void setPoints(int p) {
        points = p;
    }



}
