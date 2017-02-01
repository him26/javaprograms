import java.util.Scanner;
class FlipCoin
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter a positive integer");
		int number= sc.nextInt();
		int head=0;
		int tail=0;
		for(int i=1;i<=number;i++)
		{
			double rndno=Math.random();
			if(rndno<0.5)
			{
				tail++;
			}
			else
			{
				head++;
			}
		}
		int tailpercentage=(tail*100)/number;
		int headpercentage=(head*100)/number;
		System.out.println("coin number of tail is "+tail);
		System.out.println("coin number of head is "+head);
		System.out.println("coin tail percentage is "+tailpercentage);
		System.out.println("coin head percentage is "+headpercentage);
	}

}
