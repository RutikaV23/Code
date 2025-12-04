
public class Vowels1 {

	public static void main(String[] args) 
	{
		String s = "leetcode";
		
		StringBuilder str = new StringBuilder();
		
		for(char ch : s.toCharArray()) 
		{
			if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u') 
			{
				str.append(ch);
			}
		}
		
		System.out.println(str);
	}

}
