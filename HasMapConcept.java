package arraysconcepts;

import java.util.HashMap;
import java.util.Map.Entry;

public class HasMapConcept 
{

	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm=new HashMap<Integer, String> ();
		hm.put(1, "Scott");
		hm.put(2, "Kim");
		//System.out.println(hm);
		for(Entry<Integer, String> i:hm.entrySet())
		{
			int a=i.getKey();
			String b = i.getValue();
			System.out.println(a + "   " + b);
		}
		
		

	}

}
