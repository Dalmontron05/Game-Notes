public class Location
{
    // Instance Variables
    boolean isShip; // is there a ship here?
    int status; // if or if not location was hit, missed, or not guessed 
    
    public static final int UNGUESSED = 0;
    public static final int HIT = 1;
    public static final int MISSED = 2;
    
    
    public Location() // Location constructor.
    {
        isShip = false;
        status = UNGUESSED;
    }

    public boolean checkHit() // Was this Location a hit?
    {
        if (status == HIT)
        {
            return true;
        }
        return false;
    }

    public boolean checkMiss() // Was this location a miss?
    {
        if (status == MISSED)
        {
            return true;
        }
        return false;
    }

    public boolean isUnguessed() // Was this location unguessed?
    {
        if (status == UNGUESSED)
        {
            return true;
        }
        return false;
    }

    public void markHit() // Mark this location a hit.
    { status = HIT; }

    public void markMiss() // Mark this location a miss.
    { status = MISSED; }

    public boolean hasShip() // Return whether or not this location has a ship.
    { return isShip; }
    
    public void setShip(boolean val) // Set the value of whether this location has a ship.
    { isShip = val; }

    public void setStatus(int stat) // Set the status of this Location.
    { status = stat; }

    public int getStatus() // Get the status of this Location.
    { return status; }
}