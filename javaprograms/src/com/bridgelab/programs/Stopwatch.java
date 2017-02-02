package com.bridgelab.programs;

public class Stopwatch
{
	private static double start;
	Stopwatch()
	{
		start=System.currentTimeMillis();
	}
	
	public double elapsedtime()
	{
		double result;
		double end=System.currentTimeMillis();
		result=(end-start)/1000;
		return result;
	}
}
