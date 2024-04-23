package arraysconcepts;

public class IdentifySpecificNumber {

	public static void main(String[] args) 
	{
		int a[]= {5,7,9,2,0,8};
		boolean b=true;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==1)
			{
				System.out.println("identified the number "+ a[i] + "at position" +i);
				b=true;
				
			}
			else 
			{
				b=false;
			}
						
		}
		if(b==false)
		{
			System.out.println("not identifeid");
		}
			
			
		
	}

}
