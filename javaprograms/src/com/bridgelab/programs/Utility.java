package com.bridgelab.programs;

public class Utility 
{

	/**
	 * @param args
	 */
	public int binarysearch(int[] A,int x,int high,int low)
		{
				if(high>=low)	
					{
						int mid= (high+low)/2;
						if(A[mid]==x)
						{
							return mid;
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
					return -1;
		}
	public int binarysearch(String[] A, String x,int low,int high) 
        {
                if(high>=low)
                {
                        int mid= (high+low)/2;
                        System.out.println("ghhhhh"+mid);
                        if(A[mid].equals(x))	
                        {
                                return mid;
                        }
                      	if(A[mid].compareTo(x)<0) 
                        {
                      	//	System.out.println(A[mid].compareTo(x));

                      		return binarysearch(A, x,mid+1, high);

                        }
                      if(A[mid].compareTo(x)>0) 
                        {
                    	  //System.out.println(A[mid].compareTo(x));
                    	  return binarysearch(A, x, low, mid-1);
                        }
                }
                return -1;
        }
	public void insertionsort(int[] A)
		{
				for(int i=1;i<A.length;i++)
				{
					int key=A[i];
					int pos=i-1;
					while(pos>=0&&A[pos]>key)
					{
							A[pos+1]=A[pos];
							pos=pos-1;
					}
					A[pos+1]=key;
				}
		}
	public void insertionsort(String[] A)
		{
			String temp;
			for (int i = 0; i < A.length; i++)
			{
				temp=A[i];
				int j=0;
				for (j = i; j>0; j--)
				{
					if (temp.compareTo(A[j-1])<0) 
					{
						A[j]=A[j-1];
					}
					else
					{
						break;
					}
				}
				A[j]=temp;
			}
		}
		public void bubblesort(int[] A)
		{
			int length=A.length;
			for (int i = 0; i <length-1; i++) 
			{
				for (int j = 0; j < length-i-1; j++) 
				{
					if(A[j]>A[j+1])
					{
						int temp=A[j];
						A[j]=A[j+1];
						A[j+1]=temp;
					}
				}
			}
			
			
		}
		public void bubblesort(String[] A)
		{
			int length=A.length;
			for (int i = 0; i <length-1; i++) 
			{
				for (int j = 0; j < length-i-1; j++) 
				{
					if(A[j].compareTo(A[j+1])>0)
					{
						String temp=A[j];
						A[j]=A[j+1];
						A[j+1]=temp;
					}
				}
			}	
		}
}
