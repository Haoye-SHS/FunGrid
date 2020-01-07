
/**
 * Introduction to Two-Dimensional Arrays
 * 
 * @author (Doug Vermes) 
 * @version (01/11/2019)
 */
public class TwoDArray
{
    private final int ROWS = 2;
    private final int COLS = 3;

    private int[][] a;  // declares a two dimensional array
    
    public TwoDArray()
    {
            a = new int[ROWS][COLS];    // creates a two-dimensional array with 2 rows and
                                        // 3 columns. Since ints are defaulted to 0, every element
                                        // in this array is 0.
                                        //      0 0 0 
                                        //      0 0 0 
                                                        
            a[1][2] = 8;        // sets element in row 1, column 2 equal to 8. (recall that
                                // rows and columns are numbered beginning with 0).
                                //
                                //      0 0 0
                                //      0 0 8
    }
    
    public void printArray()
    {
        // write code here to print out the contents of 2-D array a in row-major order
    
    }
}
