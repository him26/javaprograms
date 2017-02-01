class Gambler
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of stake");
		int stake=nextInt();
		System.out.println("Enter the value of goal");
		int goal=nextInt();
		System.out.println("How many times you want to gamble");
		int noofgamble=nextInt();
		int cash=stake;	
		for(int i=0;i<=noofgamble;i++)
		{
			double randomno=Math.random();
			if(randomno<0.5)
			{
				cash++;
			}
			else
			{
				cash--;
			}
			
