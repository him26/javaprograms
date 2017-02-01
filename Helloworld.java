import java.util.Scanner;
class Helloworld
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your name");
		String name= sc.nextLine();
		if(name.length()>=3)
		{
			System.out.println("Hello"+name+"How Are you");
		
		}
		else
		{
			System.out.println("please enter name more than three character");
		}	

	}
}
