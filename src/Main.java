import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		// Gets Scanner object and Knight object
		Scanner scan = new Scanner(System.in);
		Knight knightPiece = new Knight();
		int x1 = 0, y1 = 0, x2 = 0, y2 =0; 
		
		// Display board
		knightPiece.displayBoard();

		System.out.print("Enter Starting Point:  ");
		int start = scan.nextInt();
		
		// Check to see if starting point is within board limits
		while(start < 0 || start > 63 )
		{
			System.out.println("Invalid Starting Point. Try Again.");
			System.out.print("Enter Starting Point:  ");
			start = scan.nextInt();
		}	
		
		// Converting starting point into x,y coordinates
		knightPiece.getStartCoords(start);			
		x1 = knightPiece.getStartRow();
		y1 = knightPiece.getStartCol();

		
		System.out.print("Enter Ending Point:  ");
		int end = scan.nextInt();
		
		// Check to see if ending point is within board limits
		while(end < 0 || end > 63 )
		{
			System.out.println("Invalid Ending Point. Try Again.");
			System.out.print("Enter Ending Point:  ");
			end = scan.nextInt();
		}
		
		// Converting ending point into x,y coordinates
		knightPiece.getEndCoords(end);
		x2 = knightPiece.getEndRow();
		y2 = knightPiece.getEndCol();
		
		// Display of converted points into coordinates
		System.out.println("Starting Coordinates: [" + x1 + ", " + y1 + ']' );
		System.out.println("  Ending Coordinates: [" + x2 + ", " + y2 + ']' );

		// Main check of moves
		if (start == end)
		{
			System.out.print("Distance = 0");
		}
		else if (knightPiece.checkForOne())
		{
			System.out.print("Distance = 1");
		}
		else if (knightPiece.checkForTwo())
		{
			System.out.print("Distance = 2");		
		}
		else if (knightPiece.checkForThree())
		{
			System.out.print("Distance = 3");		
		}
		else if (knightPiece.checkForFour() )
		{
			System.out.print("Distance = 4");		
		}
		else if (knightPiece.checkForFive() )
		{
			System.out.print("Distance = 5");
		}
		else if (knightPiece.checkForSix())
		{
			System.out.print("Distance = 6");
		}		
	}
}


