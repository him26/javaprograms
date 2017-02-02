import java.util.Scanner; 
class Gambler
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of stake");
		int stake=sc.nextInt(); 
		System.out.println("Enter the value of goal");
		int goal=sc.nextInt();
		System.out.println("How many times you want to gamble");
		int noofgamble=sc.nextInt();
		int win=0;
		int lose=0;
		int bet=0;	
		for(int i=0;i<=noofgamble;i++)
		{
			int cash=stake;
			while(cash>0&&cash<goal)
			{	
				bet++;	
				double randomno=Math.random();
				if(randomno<0.5)
				{
					cash++;
				}
				else
				{
					cash--;
				}
			}
			if(goal==cash)
			{
				win++;
			}
			else
			{
				lose++;
			}
		}
		int perofwin = win*100/noofgamble;
		int peroflose= lose*100/noofgamble;
		System.out.println(perofwin);
		System.out.println(peroflose);
	}
} 
