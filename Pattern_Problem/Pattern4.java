package patternProblem;

public class Pattern4 {

	public static void main(String[] args) 
	{
		int size = 5;
		for(int row = 0;row < size;row++) 
		{
			for(int space = 0 ; space < row ;space++) 
			{
				System.out.print(" ");
			}
			
			for(int col = size  ; col > row;col--) 
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
