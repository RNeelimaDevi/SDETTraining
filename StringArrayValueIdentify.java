package arraysconcepts;

public class StringArrayValueIdentify {

	public static void main(String[] args)
	{
		String s[] = {"Hello","world"};
		int count =0;
		//boolean b=true;
		//String s1="Hello";
		for(int i=0;i<s.length;i++)
		{
			if(s[i].contains("Helo"))
			{
				System.out.println("string value identified");
				count--;
				
			}
			else 
			{
				count++;
				continue;
			}

		}
		if(count>0)
		{
		System.out.println("String value not found");
		}
		
		
	}

}
