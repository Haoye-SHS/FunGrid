public class FunGrid
{
    private final int ROWS = 5;
    private final int COLS = 5;

    private char[][] grid;
    private int curRow; // current row the X is in
    private int curCol; // current column the X is in
    
    public FunGrid()
    {
        // create a 2-D array of chars with ROWS rows and COLS columns
        // initialize every element of the 2-D array to '-'
        // place an X in the top-left corner of the array
        // store the location of the current row and column that the X is in.
        grid = new char[ROWS][COLS];
        for(int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid[x].length; y++) {
                grid[x][y] = '-';
            }
        }
        grid[0][0] = 'X';
        curRow = 0;
        curCol = 0;
    }
    
    public FunGrid(int numRows, int numCols)
    {
        // create a 2-D array of chars with numRows rows and numCols columns
        // initialize every element of the 2-D array to '-'
        // place an X in the top-left corner of the array
        // store the location of the current row and column that the X is in.
        grid = new char[numRows][numCols];
        for(int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid[x].length; y++) {
                grid[x][y] = '-';
            }
        }
        grid[0][0] = 'X';
        curRow = 0;
        curCol = 0;
    }

    public void moveRight()
    {
        // if we are not in the last column, move the X right one column
        if(curCol < grid[0].length - 1) {
            grid[curRow][curCol] = '-';
            grid[curRow][curCol + 1] = 'X';
            curCol++;
        }
    }

    public void moveLeft()
    {
        // if we are not in the first column, move the X left one column
        if(curCol > 0) {
            grid[curRow][curCol] = '-';
            grid[curRow][curCol - 1] = 'X';
            curCol--;
        }
    }
    
    public void moveUp()
    {
        // if we are not in the first row, move the X up one row
        if (curRow > 0) {
            grid[curRow][curCol] = '-';
            grid[curRow - 1][curCol] = 'X';
            curRow--;
        }
    }
    
    public void moveDown()
    {
        // if we are not in the last row, move the X down one row
        if (curRow < grid.length - 1) {
            grid[curRow][curCol] = '-';
            grid[curRow + 1][curCol] = 'X';
            curRow++;
        }
    }
    
    public void printGrid()
    {
        // print out the grid to the terminal window (one row per line) with spaces between each element in a row
        for(int x = 0; x < grid.length; x++) {
            for(int y = 0; y < grid[x].length; y++) {
                System.out.print(grid[x][y] + " ");
            }
            System.out.println("");
        }
    }    
}
