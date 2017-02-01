

import java.util.Scanner;
class LeapYear
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter a positive integer year");	
		String year=sc.nextLine();
		if(year.length()>=4)
		{
			try
			{
			
				int year2=Integer.parseInt(year);	
				if(year2%400==0||year2%4==0&&year2%100!=0)
				{
					System.out.println("entered"+year2+"year is leap year");
				}
				else
				{
					System.out.println("entered "+year2+"is not leap year");
				}
			}
			catch(NumberFormatException e)	
			{
				System.out.println("Please Enter positive integer number more than three digit");
			}
		}
		else
		{
			System.out.println("please Enter a positive integer number more than three digit");
		}
	}
}
