import java.util.Scanner;
class PowerOfTwo
{
	public static int powtwo(int number)
	{
		int i=0;
		int pw=1;
		while(i<=number)	
		{
			pw=pw*2;
			i++;
		}
		return pw;
	}
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		if(num>=0&&num<31)	
		{
			for(int i=0;i<=num;i++)
			{
				int powresult=powtwo(i);
				System.out.println("power of 2^"+powresult);
				
			}	
		}
		else
		{
			System.out.println("please enter number between 0 to 31");
		}	
	}
}		
