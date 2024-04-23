package arraysconcepts;

public class EvenOddNum {

	public static void main(String[] args) 
	{
		int s[]= new int[10];
		for(int i=0;i<s.length;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even Numbers" +i);
			}
			else
			{
				System.out.println("Odd Number" +i);
			}
		}
	}

}
