

import java.util.Scanner;
import java.io.PrintWriter;
public class TwoDimArray
{
	public static void inttwodimarray(int row, int col)
	{
		Scanner sc =new Scanner(System.in);
		int[][] A=new int[row][col];
		PrintWriter out = new PrintWriter(System.out);
		System.out.println("Please enter the values for two Dim Array"); 	
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				
			 	A[i][j]=sc.nextInt();
			}
		}
		System.out.println("These are the int array values");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				out.print(A[i][j]);
			}
			out.println();
		}
		out.close();
	}
	public static void chartwodimarray(int row,int col)
	{
		Scanner sc = new Scanner(System.in);
		char[][] B=new char[row][col];
		PrintWriter out =new PrintWriter(System.out);
		System.out.println("please enter the char values for two Dim Array");
		for(int i=0;i<row;i++)
                {
                        for(int j=0;j<col;j++)
                        {
				B[i][j]=sc.next().charAt(0);	
                                
                        }
                }
                System.out.println("These are the int array values");
                for(int i=0;i<row;i++)
                {
                        for(int j=0;j<col;j++)
                        {
                                
				out.print(B[i][j]);
                        }
                        out.println();
                }
                out.close();
	}
	public static void booltwodimarray(int row,int col)
	{
		Scanner sc = new Scanner(System.in);
		boolean[][] C=new boolean[row][col];
		PrintWriter out =new PrintWriter(System.out);
		System.out.println("please enter the boolean values for two Dim Array");
		for(int i=0;i<row;i++)
                {
                        for(int j=0;j<col;j++)
                        {
				C[i][j]=sc.nextBoolean();	
                                
                        }
                }
                System.out.println("These are the int array values");
                for(int i=0;i<row;i++)
                {
                        for(int j=0;j<col;j++)
                        {
                                
				out.print(C[i][j]);
                        }
                        out.println();
                }
                out.close();
	}
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of rows");
		int R=sc.nextInt();
		System.out.println("Enter the value of col");
		int C=sc.nextInt();
		System.out.println("Enter the value of datatype");
		System.out.println(" 1 for integer");
		System.out.println(" 2 for boolean");
		System.out.println(" 3 for character");
		int number=sc.nextInt();  
   		 switch(number)
		{  
		    case 1: 
			inttwodimarray(R,C);
			break;  
		    case 2: 
			booltwodimarray(R,C);
			break;  
		    case 3:
			 chartwodimarray(R,C);
			break;  
		    default:
			System.out.println("please enter a value");  
		}
	}
}	
