package conditionalstatements;

public class GreatestNumber {

	public static void main(String[] args) 
	{
		int a=600;
		int b=200;
		int c=650;
		if((a>b) & (a>c) )
		{
			System.out.println(a + " A value is the Greatest number");
		}
		else if((b>c) & (b>a))
		{
			System.out.println(b + "  B value is the Greatest number");
		}
		else
		{
			System.out.println(c + " C value is the Greatest number");
		}

	}

}
