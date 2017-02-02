

import java.util.Scanner;
class SumOfThreeIntger
{
	public static void sumoftriplet(int num)
	{
		Scanner sc =new Scanner(System.in);
		int[] A= new int[num];
		System.out.println("Enter the values for array");
		int count=0;	
		for(int i=0;i<num;i++)	
		{
			A[i]=sc.nextInt();
		}
		
		for(int i=0;i<num;i++)
		{
			for(int j=i+1;j<num;j++) 
			{
				for(int k=j+1;k<num;k++)
				{
					if(A[i]+A[j]+A[k]==0)
					{
						System.out.println(A[i]+"  "+A[j]+"   "+A[k]);
					}
				}
			}			
		}
		for(int i=0;i<num;i++)
                {
                        for(int j=i+1;j<num;j++)
                        {
                                for(int k=j+1;k<num;k++)
                                {
                                        if(A[i]+A[j]+A[k]==0)
                                        {
                                      		count++; 
					 }
                                }
                        }
                }
		System.out.println("number of count"+count);
	 }
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the	size of array");
		int num=sc.nextInt();
	sumoftriplet(num);	
	}
}		
