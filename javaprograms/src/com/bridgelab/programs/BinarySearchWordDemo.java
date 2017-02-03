package com.bridgelab.programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BinarySearchWordDemo 
{

	public static void main(String[] args) throws IOException 
	{	
		
		Utility ul=	new Utility();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter A word which you want to search");
		String searchword=sc.next();
		File data = new File("/home/bridgelabz6/Desktop/newjavaprogrms/data.txt");  
		FileInputStream  file = new FileInputStream(data);  	   
        int k =0;  
        String s="";
        int result=0;
        while((k=file.read())!=-1)
        {  
        	s=s+(char)k;
        }
        String[] A=s.split(",");
        ul.bubblesort(A);
        result= ul.binarysearch(A, searchword, 0,A.length-1);
        System.out.println(result);
        if (result>0)
        {
    	   System.out.println("result found");
        } 
        else 
        {
        	System.out.println("result not found");
        }      
	}
}
