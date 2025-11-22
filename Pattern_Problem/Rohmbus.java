package patternProblem;

public class Rohmbus 
{
	public static void main(String[] args) 
	{
		int size = 5;
		for(int row = 0;row < size;row++) 
		{
			for(int space = 0 ; space < row ;space++) 
			{
				System.out.print(" ");
			}
			
			for(int col = size  ; col > 0;col--) 
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
