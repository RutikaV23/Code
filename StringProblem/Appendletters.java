
public class Appendletters {

	public static void main(String[] args) 
	{
		String s = "a1b@c#D$";
		
		StringBuilder str = new StringBuilder();
		
		for(char ch : s.toCharArray()) 
		{
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') 
			{
				str.append(ch);
			}
		}
		System.out.println(str);
	}
}
