
public class ReverseString {

	public static void main(String[] args) 
	{
		String s = "leetcode";
		
		StringBuilder str = new StringBuilder();
		
		for(char ch : s.toCharArray()) 
		{
			str.append(ch);
		}
		str.reverse();
		System.out.println(str);
	}

}
