package com.bridgelab.programs;

import java.util.*;
public class FindNumbers
{
	public static boolean binarysearch(int[] A,int x,int high,int low)
	{
		if(high>=low)	
		{
			int mid= (high+low)/2;
			if(A[mid]==x)
			{
				return true;
			}
			if(A[mid]<x)		
			{
				return binarysearch(A, x, mid-1, low);		
			}
			if(A[mid]>x)	
			{
				return binarysearch( A, x, high,mid+1);
			}
		}
		return false;
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
		int[] A=new int[high];
		for (int i = 0; i < A.length; i++) 
		{
			A[i]=i;
		}
		int mid=(high+low)/2;
		boolean rs=binarysearch(A, mid, high, low);
		
	}
}
