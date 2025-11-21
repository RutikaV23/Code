package patternProblem;

public class LeftTriangle {

	public static void main(String[] args) 
	{
		int size = 5;
		for(int row = 0; row < size; row++) 
		{
			for(int col = row ;col < size; col++) 
			{
				System.out.print("*");
			}
			System.out.println( );
		}
	}

}
