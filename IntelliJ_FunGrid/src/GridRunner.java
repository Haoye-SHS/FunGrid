import java.util.Scanner;

/**
 * Tests your FunGrid class
 *
 */
public class GridRunner
{
    private static final String QUIT = "Q";   // letter that denotes QUIT

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        FunGrid g;
        if (args.length>=2)  // if the user passed at least 2 command-line arguments
        {
            g = new FunGrid(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
            // parseInt takes a String containing a number and returns that number as an int
        }
        else
            g = new FunGrid();
        String response="";
        System.out.println("\f"); // clears the terminal window (not guaranteed to always work properly)

        g.printGrid();
        do
        {
            System.out.print("Enter (U)p, (D)own, (L)eft, (R)ight, or " + QUIT + " to quit: ");
            response = in.nextLine();
            response = response.toUpperCase();  // convert the user's response to all uppercase
            if (response.length() > 0)
                response = response.substring(0,1); // truncate everything except the first character
            if ("U".equals(response))
                g.moveUp();
            else if ("D".equals(response))
                g.moveDown();
            else if ("L".equals(response))
                g.moveLeft();
            else if ("R".equals(response))
                g.moveRight();
            System.out.println("\f"); // clears the terminal window (not guaranteed to always work properly)
            g.printGrid();
        }
        while (!QUIT.equals(response));

    }
}
