package com.asrar;
import java.lang.*;
import java.util.Scanner;
public class CalC {
		public static  void main(String[] args) {
			
	System.out.println("enter two values");
	Scanner input1= new Scanner(System.in);
	int a=input1.nextInt();
	Scanner input2= new Scanner(System.in);
	int b=input2.nextInt();
	int c= Adding(a,b);
	System.out.println("addition of given numbers " + a +" and " + b +" is "  + c);
	int d= Sub(a,b);
	System.out.println("sub of given numbers " + a +" and " + b +" is "  + d);
	int e= Mul(a,b);
	System.out.println("mul of given numbers " + a +" and " + b +" is "  + e);
	int f= Div(a,b);
	System.out.println("division of given numbers " + a +" and " + b +" is "  + f);

		}	


	public static int Adding(int a, int b)
	{
	return a+b;
	}
	public static int Sub(int a, int b)
	{
	return a-b;
	}
	public static int Mul(int a, int b)
	{
	return a*b;
	}
	public static int Div(int a, int b)
	{
	return a/b;
	}
