package arraysconcepts;

public class SmallestLargestNum {

	public static void main(String[] args) 
	{
	 int a[]= {1,2,3,4,5,1,5,6};
	 int s = a[0];
	 int b = a[0];
	 for(int i=0;i<a.length;i++)
	 {
		 if(a[i]>b)
		 {
			 b=a[i];
		 }
		 else if(a[i]<s)
		 {
			 s=a[i];
		 }
		
	 }
	 System.out.println("Largest number is: "+ b);
	 System.out.println("Smallest number is: "+ s);

	}

}
