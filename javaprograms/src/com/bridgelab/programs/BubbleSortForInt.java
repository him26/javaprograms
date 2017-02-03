package com.bridgelab.programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BubbleSortForInt
{
	public static void main(String[] args) throws IOException 
	{
		Utility ul=new Utility();
		File data =new File("/home/bridgelabz6/Desktop/newjavaprogrms/intdata.txt");
		FileInputStream fs=new FileInputStream(data);
		int k=0;
		String s="";
		while((k=fs.read())!=-1)
		{
				s=s+(char)k;
		}
		System.out.println("elements before sorting");
		System.out.println(s);
		String[] s1=s.split(",");
		int[] A=new int[s1.length];
			for (int i = 0; i <A.length; i++) 
			{
				String temp=s1[i];
				A[i]=Integer.parseInt(temp.trim());
			}
			System.out.println("elements after sorting");
			ul.bubblesort(A);
			for (int i = 0; i < A.length; i++)
			{
				System.out.print(A[i]+",");	
			}
		
	}
}
