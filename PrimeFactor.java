import java.util.ArrayList; 
import java.util.Scanner;
class PrimeFactor 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter a number");	
		String primefactor="";	
		int num=sc.nextInt();
		ArrayList<Integer> a= new ArrayList<Integer>(); 
		for(int i=2;i<=num;i++)
		{
			while(num%i==0)
			{
				a.add(i);		
				num=num/i;	
			}	
		}
		System.out.println(a.toString());
	}
} 
