public class Grid
{
    // Instance Variables
    private Location[][] grid;
    public static final int NUM_ROWS = 10;
    public static final int NUM_COLS = 10;
    public static final String[] ALPHA = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"};
    
    // Ship Constants
    // private static final int UNSET = -1;
    private static final int HORIZONTAL = 0;
    // private static final int VERTICAL = 1;
    
    public Grid()
    {
        grid = new Location[NUM_ROWS][NUM_COLS];
        for (int r = 0; r < NUM_COLS; r++)
        {
            for (int c = 0; c < NUM_COLS; c++)
            {
                grid[r][c] = new Location();
            }
        }
    }
    
    public void markHit(int row, int col) // Mark a hit in this location by calling the markHit method on the Location object.
    { grid[row][col].markHit(); }
    
    public void markMiss(int row, int col) // Mark a miss on this location.
    { grid[row][col].markMiss(); }
    
    public void setStatus(int row, int col, int status) // Set the status of this location object
    { grid[row][col].setStatus(status); }
    
    public int getStatus(int row, int col) // Get the status of this location in the grid
    { return(grid[row][col].getStatus()); }
    
    public boolean alreadyGuessed(int row, int col) // Return whether or not this Location has already been guessed.
    {
        if((grid[row][col].isUnguessed()))
        { return false; }
        
        return true;
    }
    
    public void setShip(int row, int col, boolean val)
    { grid[row][col].setShip(val); }
    
    public boolean hasShip(int row, int col)
    { return(grid[row][col].hasShip()); }
    
    public Location get(int row, int col)
    { return grid[row][col]; }
    
    public void addShip(Ship s) // Adds a ship to 
    {
        int row = s.getRow();
        int col = s.getCol();
        // int length = s.getLength();
        
        if (s.getDirection() == HORIZONTAL)
        {
            for (int i = col; i < col + s.getLength(); i++)
            {
                setShip(row, i, true);
            }
        }
        else
        {
            for (int i = row; i < row + s.getLength(); i++)
            {
                setShip(i, col, true);
            }
        }
    }
    
    public int numRows() // Return the number of rows in the Grid
    { return NUM_ROWS; }
    
    public int numCols() // Return the number of columns in the grid
    { return NUM_COLS; }
    
    public void printStatus() // Prints a graphical representation of the hit status on a grid. This includes the x and y axis that you would typically see in battleship.
    {
        System.out.println("  1 2 3 4 5 6 7 8 9 10"); // prints top y-axis legend
        
        for (int r = 0; r < NUM_COLS; r++) // r = row
        {
            System.out.print(ALPHA[r] + " ");
            
            for (int c = 0; c < NUM_COLS; c++) // c = column
            {
                if (grid[r][c].isUnguessed() == true)
                { System.out.print("- "); }
                
                else if (grid[r][c].getStatus() == 1)
                { System.out.print("X "); }
                
                else
                { System.out.print("O "); }
            }
            
            System.out.println("");
        }
    }
    
    public void printShips() // Prints a graphical representation of the ship locations on a grid. This includes the x and y axis that you would typically see in battleship.
    {
        System.out.println("  1 2 3 4 5 6 7 8 9 10"); // prints top y-axis legend
        
        for (int r = 0; r < NUM_COLS; r++) // r = row
        {
            System.out.print(ALPHA[r] + " ");
            
            for (int c = 0; c < NUM_COLS; c++) // c = column
            {
                if (grid[r][c].hasShip() == false)
                { System.out.print("- "); }
                
                else
                { System.out.print("X "); }
            }
            
            System.out.println("");
        }
    }
}