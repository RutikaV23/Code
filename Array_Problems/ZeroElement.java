//Move All Zeroes to the End

//Example:
//Input → [0,1,0,3,12]
//Output → [1,3,12,0,0]

package arrayProblems;

public class ZeroElement {

	static int[]  numbers = {0,1,0,3,12};

	public static void main(String[] args) 
	{
		int index = 0;
	
		for(int ele = 0 ;ele < numbers.length ;ele++) 
		{
			if(numbers[ele] != 0) 
			{
				numbers[index] = numbers[ele];
				index++;
			}
		}
		
		while (index < numbers.length) {
            numbers[index] = 0;
            index++;
        }
		 
		for (int num : numbers) {
            System.out.print(num + " ");
        }
		
	}

}
