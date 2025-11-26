package arrayProblems;

public class SumTwoNum {

	static int[]  numbers = {2,4,6,8,10,1};
	
	public static void main(String[] args) 
	{
		int targetValue = 9;
		
		for(int ele = 0 ;ele < numbers.length-1; ele++ ) 
		{
			 for (int j = ele + 1; j < numbers.length; j++) 
			 {
				 if(numbers[ele] + numbers[j] == targetValue) 
					{
						System.out.printf("[" + ele + "]"+"[" + j + "]");
						return;
					}
			 }	
		}
	}

}
