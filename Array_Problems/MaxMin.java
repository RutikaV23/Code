package arrayProblems;
//Return the largest and smallest value in the array.
public class MaxMin {
	
	static int[]  numbers = {2,4,6,8,10,1};

	public static void main(String[] args) 
	{
		int max = numbers[0];
		int min = numbers[0];
		
		for(int ele = 0 ;ele < numbers.length ;ele++) 
		{
			if(max < numbers[ele]) 
			{
				max = numbers[ele];
			}
		}

		System.out.println("Max num is " + max);

		for(int ele = 0 ;ele < numbers.length ;ele++) 
		{
			if(min > numbers[ele]) 
			{
				min = numbers[ele];
			}
		}
		System.out.println("Min num is " + min);
	}

}
