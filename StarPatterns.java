/**
 * This program makes little pictures using stars. These methods
 * are so much fun to write.
 *
 * (Look in the StarInstructions.txt file to see what each method
 *  should draw.)
 *
 * @author  [          ] <-- you
 * @version [          ] <-- today
 */


class StarPatterns 
{
    public static void starGrid(int h, int w)
    {           
        for (int row=0; row<h; row++)
        {
            for (int col=0; col<w; col++)
            {               
                System.out.print(row + "" + col + " ");
            }
            System.out.println();
        }   
    }
    
    public static void starBox(int h, int w)
    {
        for (int row=0; row<h; row++)
        {
            for (int col=0; col<w; col++)
            {   
                if (row==0 || row==h-1 || col==0 || col==w-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(row + "" + col + " ");
            }
            System.out.println();
        }   
    }

    public static void starX(int h)
    {
        int w = h;

        for (int row=0; row<h; row++)
        {
            for (int col=0; col<w; col++)
            {
                if (row==col || row+col==h-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(row + "" + col + " ");
            }
            System.out.println();
        }   
    }
    
    public static void starZ(int h)
    {
    
    }

    public static void main(String[] args) 
    {
        starGrid(5, 5);
        System.out.println();

        starBox(7, 9);
        System.out.println();
        
        starX(7);
        System.out.println();
        
        starZ(7);
        System.out.println();
            
	}
     
}