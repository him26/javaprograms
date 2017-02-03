package com.bridgelab.programs;

import java.util.*;
public class FindNumbers
{
	public static boolean userans()
	{
		Scanner sc=new Scanner(System.in);
		boolean rs=sc.nextBoolean();
		return rs;
	}
	public static int search(int high,int low)
	{
		if(high>=low)	
		{
			int mid= (high+low)/2;
			System.out.println("is it your element    "+mid); 
			boolean a=userans();
			if(a)
			{
				System.out.println("you got your answer");
				return mid;
			}
			System.out.println("is your element is lesser than   "+mid);
			boolean b=userans();
			if(b)		
			{
				return search(mid-1, low);		
			}
			System.out.println("is your element is greater than   "+mid);
			boolean c=userans();
			if(c)	
			{
				return search(high,mid+1);
			}
		}
		return -1;
	}
	Utility ul=new Utility();
	public static void main(String[] args)
	{
		Utility ul=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int high=(int)Math.pow(2, num);
		int low=0;
		System.out.println("select a no between "+low+" to "+high);
		search(high, low);
	}
}
