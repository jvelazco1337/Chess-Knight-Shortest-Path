/**
 * Javier Velazco
 * 
 */


public class Knight
{
	private final int SIZE = 8;
	private int[][] gameBoard = new int[SIZE][SIZE];
	int x1 = 0, y1 = 0;
	int x2 = 0, y2 = 0;

	/**
	 * Constructor, sets the array and numbers each corresponding tile 
	 */
	public Knight()
	{
		setBoard();
	}
	
	/**
	 * Assigns a number from 0-63 to each box in the board 
	 */
	public void setBoard()
	{
		int count = 0;
		for (int rows = 0; rows < SIZE; rows++)
        {
            for (int cols = 0; cols < SIZE; cols++)
            {
                gameBoard[rows][cols] = count ;
                count++;
            }
        }
	}
	
	
	/**
	 * Displays the game board for reference 
	 */
	public void displayBoard()
	{
		int count = 0;
		System.out.println("    a   b   c   d   e   f   g   h");
		System.out.println("  ---------------------------------");
		for (int rows = 0; rows < SIZE; rows++)
        {
			System.out.print((Math.abs(rows - 8)) + " |");
            for (int cols = 0; cols < SIZE; cols++)
            {
                if (count <= 9)
                {
                	System.out.print(gameBoard[rows][cols] + "  |");
                }
                else
                {
                	System.out.print(gameBoard[rows][cols] + " |");
                }
                count++;
            }
            System.out.println();
            System.out.println("  ---------------------------------");
        }
	}
	


	/**
	 * Converts the point of the board into x,y coordinates
	 * @param start Starting point from the board
	 */
	public void getStartCoords(int start)
	{
		for (int rows = 0; rows < SIZE; rows++)
        {
            for (int cols = 0; cols < SIZE; cols++)
            {
            	if (gameBoard[rows][cols] == start)
            	{
            		x1 = rows;
            		y1 = cols;
            	}
                
            }
        }
	}
	
	/**
	 * Converts the point of the board into x,y coordinates
	 * @param end Ending point from the board
	 */
	public void getEndCoords(int end)
	{
		for (int rows = 0; rows < SIZE; rows++)
        {
            for (int cols = 0; cols < SIZE; cols++)
            {
            	if (gameBoard[rows][cols] == end)
            	{
            		x2 = rows;
            		y2 = cols;
            	}
                
            }
        }
	}
	
	/**
	 * Gets the row from starting point 
	 * @return Row from starting point
	 */
	public int getStartRow()
	{
		return this.x1;
	}
	
	/**
	 * Gets the column from starting point 
	 * @return Column from starting point
	 */
	public int getStartCol()
	{
		return this.y1;
	}
	
	/**
	 * Gets the row from ending point 
	 * @return Row from ending point
	 */
	public int getEndRow()
	{
		return this.x2;
	}
	
	/**
	 * Gets the column from ending point 
	 * @return Column from ending point
	 */
	public int getEndCol()
	{
		return this.y2;
	}
	
	/**
	 * Checks both coordinates to see if the move is do-able with 1 move 
	 * @return True if move is do-able with 1 move, otherwise false
	 */
	public boolean checkForOne()
	{
		if(    (x2 == (x1 + 1) && y2 == (y1 + 2)) || (x2 == (x1 + 1) && y2 == (y1 - 2)) || (x2 == (x1 - 1) && y2 == (y1 + 2)) || (x2 == (x1 - 1) && y2 == (y1 - 2)) 
		    || (x2 == (x1 + 2) && y2 == (y1 + 1)) || (x2 == (x1 + 2) && y2 == (y1 - 1)) || (x2 == (x1 - 2) && y2 == (y1 + 1)) || (x2 == (x1 - 2) && y2 == (y1 - 1)))
		{
			return true;
		}
		return false;
	}
	
	/**
	 * Checks both coordinates to see if the move is do-able with 2 moves 
	 * @return True if move is do-able with 2 moves, otherwise false
	 */
	public boolean checkForTwo()
	{
		if(    (x2 == (x1 + 0) && y2 == (y1 + 2)) || (x2 == (x1 + 0) && y2 == (y1 - 2))
		    || (x2 == (x1 + 0) && y2 == (y1 + 4)) || (x2 == (x1 + 0) && y2 == (y1 - 4))
	    	|| (x2 == (x1 + 2) && y2 == (y1 + 0)) || (x2 == (x1 - 2) && y2 == (y1 + 0))
			|| (x2 == (x1 + 4) && y2 == (y1 + 0)) || (x2 == (x1 - 4) && y2 == (y1 + 0))
			|| (x2 == (x1 + 1) && y2 == (y1 + 1)) || (x2 == (x1 + 1) && y2 == (y1 - 1)) || (x2 == (x1 - 1) && y2 == (y1 + 1)) || (x2 == (x1 - 1) && y2 == (y1 - 1))
			|| (x2 == (x1 + 1) && y2 == (y1 + 3)) || (x2 == (x1 + 1) && y2 == (y1 - 3)) || (x2 == (x1 - 1) && y2 == (y1 + 3)) || (x2 == (x1 - 1) && y2 == (y1 - 3))
			|| (x2 == (x1 + 2) && y2 == (y1 + 4)) || (x2 == (x1 + 2) && y2 == (y1 - 4)) || (x2 == (x1 - 2) && y2 == (y1 + 4)) || (x2 == (x1 - 2) && y2 == (y1 - 4))
			|| (x2 == (x1 + 3) && y2 == (y1 + 1)) || (x2 == (x1 + 3) && y2 == (y1 - 1)) || (x2 == (x1 - 3) && y2 == (y1 + 1)) || (x2 == (x1 - 3) && y2 == (y1 - 1))
			|| (x2 == (x1 + 3) && y2 == (y1 + 3)) || (x2 == (x1 + 3) && y2 == (y1 - 3)) || (x2 == (x1 - 3) && y2 == (y1 + 3)) || (x2 == (x1 - 3) && y2 == (y1 - 3)) 
			|| (x2 == (x1 + 4) && y2 == (y1 + 2)) || (x2 == (x1 + 4) && y2 == (y1 - 2)) || (x2 == (x1 - 4) && y2 == (y1 + 2)) || (x2 == (x1 - 4) && y2 == (y1 - 2)))
		{
			return true;
		}
		return false;		
	}
	
	/**
	 * Checks both coordinates to see if the move is do-able with 3 moves 
	 * @return True if move is do-able with 3 moves, otherwise false
	 */
	public boolean checkForThree()
	{
		if(    (x2 == (x1 + 0) && y2 == (y1 + 1)) || (x2 == (x1 + 0) && y2 == (y1 - 1))
		    || (x2 == (x1 + 0) && y2 == (y1 + 3)) || (x2 == (x1 + 0) && y2 == (y1 - 3)) 
			|| (x2 == (x1 + 0) && y2 == (y1 + 5)) || (x2 == (x1 + 0) && y2 == (y1 - 5))
			|| (x2 == (x1 + 1) && y2 == (y1 + 0)) || (x2 == (x1 - 1) && y2 == (y1 + 0))
			|| (x2 == (x1 + 3) && y2 == (y1 + 0)) || (x2 == (x1 - 3) && y2 == (y1 + 0))
			|| (x2 == (x1 + 5) && y2 == (y1 + 0)) || (x2 == (x1 - 5) && y2 == (y1 + 0)) 
			|| (x2 == (x1 + 1) && y2 == (y1 + 4)) || (x2 == (x1 + 1) && y2 == (y1 - 4)) || (x2 == (x1 - 1) && y2 == (y1 + 4)) || (x2 == (x1 - 1) && y2 == (y1 - 4))
			|| (x2 == (x1 + 1) && y2 == (y1 + 6)) || (x2 == (x1 + 1) && y2 == (y1 - 6)) || (x2 == (x1 - 1) && y2 == (y1 + 6)) || (x2 == (x1 - 1) && y2 == (y1 - 6)) 
			|| (x2 == (x1 + 2) && y2 == (y1 + 3)) || (x2 == (x1 + 2) && y2 == (y1 - 3)) || (x2 == (x1 - 2) && y2 == (y1 + 3)) || (x2 == (x1 - 2) && y2 == (y1 - 3)) 
			|| (x2 == (x1 + 2) && y2 == (y1 + 5)) || (x2 == (x1 + 2) && y2 == (y1 - 5)) || (x2 == (x1 - 2) && y2 == (y1 + 5)) || (x2 == (x1 - 2) && y2 == (y1 - 5))
			|| (x2 == (x1 + 3) && y2 == (y1 + 2)) || (x2 == (x1 + 3) && y2 == (y1 - 2)) || (x2 == (x1 - 3) && y2 == (y1 + 2)) || (x2 == (x1 - 3) && y2 == (y1 - 2)) 
			|| (x2 == (x1 + 3) && y2 == (y1 + 4)) || (x2 == (x1 + 3) && y2 == (y1 - 4)) || (x2 == (x1 - 3) && y2 == (y1 + 4)) || (x2 == (x1 - 3) && y2 == (y1 - 4))
			|| (x2 == (x1 + 3) && y2 == (y1 + 6)) || (x2 == (x1 + 3) && y2 == (y1 - 6)) || (x2 == (x1 - 3) && y2 == (y1 + 6)) || (x2 == (x1 - 3) && y2 == (y1 - 6))  
			|| (x2 == (x1 + 4) && y2 == (y1 + 1)) || (x2 == (x1 + 4) && y2 == (y1 - 1)) || (x2 == (x1 - 4) && y2 == (y1 + 1)) || (x2 == (x1 - 4) && y2 == (y1 - 1))
			|| (x2 == (x1 + 4) && y2 == (y1 + 3)) || (x2 == (x1 + 4) && y2 == (y1 - 3)) || (x2 == (x1 - 4) && y2 == (y1 + 3)) || (x2 == (x1 - 4) && y2 == (y1 - 3))   
			|| (x2 == (x1 + 4) && y2 == (y1 + 5)) || (x2 == (x1 + 4) && y2 == (y1 - 5)) || (x2 == (x1 - 4) && y2 == (y1 + 5)) || (x2 == (x1 - 4) && y2 == (y1 - 5))
			|| (x2 == (x1 + 5) && y2 == (y1 + 2)) || (x2 == (x1 + 5) && y2 == (y1 - 2)) || (x2 == (x1 - 5) && y2 == (y1 + 2)) || (x2 == (x1 - 5) && y2 == (y1 - 2)) 
			|| (x2 == (x1 + 5) && y2 == (y1 + 4)) || (x2 == (x1 + 5) && y2 == (y1 - 4)) || (x2 == (x1 - 5) && y2 == (y1 + 4)) || (x2 == (x1 - 5) && y2 == (y1 - 4))
			|| (x2 == (x1 + 6) && y2 == (y1 + 1)) || (x2 == (x1 + 6) && y2 == (y1 - 1)) || (x2 == (x1 - 6) && y2 == (y1 + 1)) || (x2 == (x1 - 6) && y2 == (y1 - 1))
			|| (x2 == (x1 + 6) && y2 == (y1 + 3)) || (x2 == (x1 + 6) && y2 == (y1 - 3)) || (x2 == (x1 - 6) && y2 == (y1 + 3)) || (x2 == (x1 - 6) && y2 == (y1 - 3)))
		{
			return true;
		}
		return false;
	}
	
	/**
	 * Checks both coordinates to see if the move is do-able with 4 moves 
	 * @return True if move is do-able with 4 moves, otherwise false
	 */
	public boolean checkForFour()
	{
		if(    (x2 == (x1 + 0) && y2 == (y1 + 6)) || (x2 == (x1 + 0) && y2 == (y1 - 6))
			|| (x2 == (x1 + 6) && y2 == (y1 + 0)) || (x2 == (x1 - 6) && y2 == (y1 + 0))
			|| (x2 == (x1 + 1) && y2 == (y1 + 5)) || (x2 == (x1 + 1) && y2 == (y1 - 5)) || (x2 == (x1 - 1) && y2 == (y1 + 5)) || (x2 == (x1 - 1) && y2 == (y1 - 5)) 
			|| (x2 == (x1 + 1) && y2 == (y1 + 7)) || (x2 == (x1 + 1) && y2 == (y1 - 7)) || (x2 == (x1 - 1) && y2 == (y1 + 7)) || (x2 == (x1 - 1) && y2 == (y1 - 7))
			|| (x2 == (x1 + 2) && y2 == (y1 + 2)) || (x2 == (x1 + 2) && y2 == (y1 - 2)) || (x2 == (x1 - 2) && y2 == (y1 + 2)) || (x2 == (x1 - 2) && y2 == (y1 - 2))  
			|| (x2 == (x1 + 2) && y2 == (y1 + 6)) || (x2 == (x1 + 2) && y2 == (y1 - 6)) || (x2 == (x1 - 2) && y2 == (y1 + 6)) || (x2 == (x1 - 2) && y2 == (y1 - 6)) 
			|| (x2 == (x1 + 3) && y2 == (y1 + 5)) || (x2 == (x1 + 3) && y2 == (y1 - 5)) || (x2 == (x1 - 3) && y2 == (y1 + 5)) || (x2 == (x1 - 3) && y2 == (y1 - 5))
			|| (x2 == (x1 + 3) && y2 == (y1 + 7)) || (x2 == (x1 + 3) && y2 == (y1 - 7)) || (x2 == (x1 - 3) && y2 == (y1 + 7)) || (x2 == (x1 - 3) && y2 == (y1 - 7))  
			|| (x2 == (x1 + 4) && y2 == (y1 + 4)) || (x2 == (x1 + 4) && y2 == (y1 - 4)) || (x2 == (x1 - 4) && y2 == (y1 + 4)) || (x2 == (x1 - 4) && y2 == (y1 - 4))
			|| (x2 == (x1 + 4) && y2 == (y1 + 6)) || (x2 == (x1 + 4) && y2 == (y1 - 6)) || (x2 == (x1 - 4) && y2 == (y1 + 6)) || (x2 == (x1 - 4) && y2 == (y1 - 6)) 
			|| (x2 == (x1 + 5) && y2 == (y1 + 1)) || (x2 == (x1 + 5) && y2 == (y1 - 1)) || (x2 == (x1 - 5) && y2 == (y1 + 1)) || (x2 == (x1 - 5) && y2 == (y1 - 1))  
			|| (x2 == (x1 + 5) && y2 == (y1 + 3)) || (x2 == (x1 + 5) && y2 == (y1 - 3)) || (x2 == (x1 - 5) && y2 == (y1 + 3)) || (x2 == (x1 - 5) && y2 == (y1 - 3))
			|| (x2 == (x1 + 5) && y2 == (y1 + 5)) || (x2 == (x1 + 5) && y2 == (y1 - 5)) || (x2 == (x1 - 5) && y2 == (y1 + 5)) || (x2 == (x1 - 5) && y2 == (y1 - 5))
			|| (x2 == (x1 + 5) && y2 == (y1 + 7)) || (x2 == (x1 + 5) && y2 == (y1 - 7)) || (x2 == (x1 - 5) && y2 == (y1 + 7)) || (x2 == (x1 - 5) && y2 == (y1 - 7))
			|| (x2 == (x1 + 6) && y2 == (y1 + 2)) || (x2 == (x1 + 6) && y2 == (y1 - 2)) || (x2 == (x1 - 6) && y2 == (y1 + 2)) || (x2 == (x1 - 6) && y2 == (y1 - 2))
			|| (x2 == (x1 + 6) && y2 == (y1 + 4)) || (x2 == (x1 + 6) && y2 == (y1 - 4)) || (x2 == (x1 - 6) && y2 == (y1 + 4)) || (x2 == (x1 - 6) && y2 == (y1 - 4))
			|| (x2 == (x1 + 6) && y2 == (y1 + 6)) || (x2 == (x1 + 6) && y2 == (y1 - 6)) || (x2 == (x1 - 6) && y2 == (y1 + 6)) || (x2 == (x1 - 6) && y2 == (y1 - 6))
			|| (x2 == (x1 + 7) && y2 == (y1 + 1)) || (x2 == (x1 + 7) && y2 == (y1 - 1)) || (x2 == (x1 - 7) && y2 == (y1 + 1)) || (x2 == (x1 - 7) && y2 == (y1 - 1))
			|| (x2 == (x1 + 7) && y2 == (y1 + 3)) || (x2 == (x1 + 7) && y2 == (y1 - 3)) || (x2 == (x1 - 7) && y2 == (y1 + 3)) || (x2 == (x1 - 7) && y2 == (y1 - 3))
			|| (x2 == (x1 + 7) && y2 == (y1 + 5)) || (x2 == (x1 + 7) && y2 == (y1 - 5)) || (x2 == (x1 - 7) && y2 == (y1 + 5)) || (x2 == (x1 - 7) && y2 == (y1 - 5)))
		{
			return true;
		}
		return false;
	}
	
	/**
	 * Checks both coordinates to see if the move is do-able with 5 moves 
	 * @return True if move is do-able with 5 moves, otherwise false
	 */
	public boolean checkForFive()
	{
		if(    (x2 == (x1 + 0) && y2 == (y1 + 7)) || (x2 == (x1 + 0) && y2 == (y1 - 7))
			|| (x2 == (x1 + 7) && y2 == (y1 + 0)) || (x2 == (x1 - 7) && y2 == (y1 + 0)) 
			|| (x2 == (x1 + 2) && y2 == (y1 + 7)) || (x2 == (x1 + 2) && y2 == (y1 - 7)) || (x2 == (x1 - 2) && y2 == (y1 + 7)) || (x2 == (x1 - 2) && y2 == (y1 - 7))
			|| (x2 == (x1 + 4) && y2 == (y1 + 7)) || (x2 == (x1 + 4) && y2 == (y1 - 7)) || (x2 == (x1 - 4) && y2 == (y1 + 7)) || (x2 == (x1 - 4) && y2 == (y1 - 7))
			|| (x2 == (x1 + 5) && y2 == (y1 + 6)) || (x2 == (x1 + 5) && y2 == (y1 - 6)) || (x2 == (x1 - 5) && y2 == (y1 + 6)) || (x2 == (x1 - 5) && y2 == (y1 - 6))
			|| (x2 == (x1 + 6) && y2 == (y1 + 5)) || (x2 == (x1 + 6) && y2 == (y1 - 5)) || (x2 == (x1 - 6) && y2 == (y1 + 5)) || (x2 == (x1 - 6) && y2 == (y1 - 5))  
			|| (x2 == (x1 + 6) && y2 == (y1 + 7)) || (x2 == (x1 + 6) && y2 == (y1 - 7)) || (x2 == (x1 - 6) && y2 == (y1 + 7)) || (x2 == (x1 - 6) && y2 == (y1 - 7))
			|| (x2 == (x1 + 7) && y2 == (y1 + 2)) || (x2 == (x1 + 7) && y2 == (y1 - 2)) || (x2 == (x1 - 7) && y2 == (y1 + 2)) || (x2 == (x1 - 7) && y2 == (y1 - 2))
			|| (x2 == (x1 + 7) && y2 == (y1 + 4)) || (x2 == (x1 + 7) && y2 == (y1 - 4)) || (x2 == (x1 - 7) && y2 == (y1 + 4)) || (x2 == (x1 - 7) && y2 == (y1 - 4))
			|| (x2 == (x1 + 7) && y2 == (y1 + 6)) || (x2 == (x1 + 7) && y2 == (y1 - 6)) || (x2 == (x1 - 7) && y2 == (y1 + 6)) || (x2 == (x1 - 7) && y2 == (y1 - 6)))
		{
			return true;
		}
		return false;
	}
	
	/**
	 * Checks both coordinates to see if the move is do-able with 6 moves 
	 * @return True if move is do-able with 6 moves, otherwise false
	 */
	public boolean checkForSix()
	{
		if((x2 == (x1 + 7) && y2 == (y1 + 7)) || (x2 == (x1 + 7) && y2 == (y1 - 7)) || (x2 == (x1 - 7) && y2 == (y1 + 7)) || (x2 == (x1 - 7) && y2 == (y1 - 7)))
		{
			return true;
		}
		return false;
	}

}
