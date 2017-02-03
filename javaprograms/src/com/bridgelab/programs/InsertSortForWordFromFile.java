package com.bridgelab.programs;
import java.io.*;
import java.util.*;
class InsertSortForWordFromFile
{
	public static void main(String[] args) throws IOException 
	{

		Utility util=	new Utility();
		File data = new File("/home/bridgelabz6/Desktop/newjavaprogrms/data.txt");  
		FileInputStream  file = new FileInputStream(data);  	   
        int k =0;  
        String s="";
        
        while((k=file.read())!=-1)
        {  
        	s=s+(char)k;
        }
        String[] Unsortedarray=s.split(",");
        System.out.println("This unsorted element from file");
        for (int i = 0; i < Unsortedarray.length; i++) 
        {
        	System.out.print(Unsortedarray[i]+" ");
		}
        util.insertionsort(Unsortedarray);
        System.out.println("This sorted element from file");
        for (int i = 0; i < Unsortedarray.length; i++) 
        {
        	System.out.print(Unsortedarray[i]+" ");
		}
        file.close();
	}
}
		