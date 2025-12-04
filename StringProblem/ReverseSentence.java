
public class ReverseSentence {

	public static void main(String[] args) 
	{
		String s = "I LOVE JAVA";
		
		StringBuilder str = new StringBuilder();
		
		for(char ch : s.toCharArray()) 
		{
			str.append(ch);
		}
		str.reverse();
		System.out.println(str);
	}

}
