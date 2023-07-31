public class Ship
{
    private int row; // What row locations the ship is at
    private int col; // What column location the ship is at
    private int length; // How long is the ship
    private int direction; // Vertical or horizontal
    
    // direction constants
    private static final int UNSET = -1;
    private static final int HORIZONTAL = 0;
    // private static final int VERTICAL = 1;
    
    // Constructor. Create a ship and set the length.
    public Ship(int length) {
        this.length = length;
        direction = UNSET;
        row = UNSET;
        col = UNSET;
    }

    // Has the location been initialized
    public boolean isLocationSet() {
        if (row == UNSET || col == UNSET) {
            return false;
        }
        else return true;
    }

    // Has the direction been initialized
    public boolean isDirectionSet() {
        if (direction == UNSET)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    // Set the location of the ship 
    public void setLocation(int row, int col) {
        this.row = row;
        this.col = col;
    }

    // Set the direction of the ship
    public void setDirection(int direction) {
        this.direction = direction;
    }

    // Getter for the row value
    public int getRow() {
        return row;
    }

    // Getter for the column value
    public int getCol() {
        return col;
    }

    // Getter for the length of the ship
    public int getLength() {
        return length;
    }

    // Getter for the direction
    public int getDirection() {
        return direction;
    }

    // Helper method to get a string value from the direction
    private String directionToString() {
        if (direction == UNSET) {
            return "unset direction";
        }
        else if (direction == HORIZONTAL) {
            return "horizontal";
        }
        else {
            return "vertical";
        }
    }

    // Helper method to get a (row, col) string value from the location
    private String locationToString() {
        String rString;
        if (isLocationSet())
        {
            rString = "(" + row + ", " + col + ")";
        }
        else
        {
            rString = "(unset location)";
        }
        
        return rString;
    }

    // toString value for this Ship
    public String toString() {
        return directionToString() + " ship of length " + length + " at " + locationToString();
    }
    
}