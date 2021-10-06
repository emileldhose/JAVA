import java.io.*;
import java.util.Scanner;
class Factorial
	{
		public static void main(String args[])
		{
			int n,f=1,i;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a number");
			n=sc.nextInt();
			if(n>0)
				{		
					f=n*(n-1);
					
				}
			System.out.println("Factorial of a number"+f);
		}
	}
