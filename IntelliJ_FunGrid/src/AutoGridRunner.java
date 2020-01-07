import java.util.Scanner;

/**
 * Tests your FunGrid class without any user input.
 *
 */
public class AutoGridRunner
{
    private static final String QUIT = "Q";   // letter that denotes QUIT
    private static final int SLEEP_TIME = 100;  // amount of time to sleep between method calls.
    private static final int UP = 0;
    private static final int DOWN = 1;
    private static final int LEFT = 2;
    private static final int RIGHT = 3;

    public static void main(String[] args) throws java.lang.InterruptedException
    {
        System.out.println("\fTesting FunGrid()");
        Thread.sleep(1000);
        testGrid(0,0);
        System.out.println("\fTesting FunGrid(7,9)");
        Thread.sleep(1000);
        testGrid(7,9);
    }

    /**
     * Tests the FunGrid class.
     * @param numRows the number of rows in the grid to test (0 if you wish to use default constructor)
     * @param numCols the number of columns in the grid to test (0 if you wish to use default constructor)
     */
    private static void testGrid(int numRows, int numCols) throws java.lang.InterruptedException
    {
        FunGrid g;
        int rows, cols;
        if (numRows == 0 || numCols == 0)
        {
            g = new FunGrid();
            rows = 5;
            cols = 5;
        }
        else
        {
            g = new FunGrid(numRows, numCols);
            rows = numRows;
            cols = numCols;
        }
        System.out.println("\f"); // clears the terminal window (not guaranteed to always work properly)

        g.printGrid();

        testDirection(g,RIGHT,cols+2);
        testDirection(g,DOWN,rows+2);
        testDirection(g,LEFT,cols+2);
        testDirection(g,UP,rows+2);

        for (int i=0; i < 40; i++)
        {
            int direction = (int)(Math.random()*4);
            if (direction == UP)
                g.moveUp();
            else if (direction == DOWN)
                g.moveDown();
            else if (direction == LEFT)
                g.moveLeft();
            else
                g.moveRight();
            System.out.println("\f"); // clears the terminal window (not guaranteed to always work properly)
            g.printGrid();
            Thread.sleep(SLEEP_TIME);
        }
    }

    private static void testDirection(FunGrid gr, int direction, int numIterations) throws java.lang.InterruptedException
    {
        for (int i=0; i < numIterations; i++)
        {
            if (direction == UP)
                gr.moveUp();
            else if (direction == DOWN)
                gr.moveDown();
            else if (direction == LEFT)
                gr.moveLeft();
            else
                gr.moveRight();
            System.out.println("\f"); // clears the terminal window (not guaranteed to always work properly)
            gr.printGrid();
            Thread.sleep(SLEEP_TIME);
        }

    }

}
