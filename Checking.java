import java.io.*;
import java.util.Scanner;
class Checking
	{
		public static void main(String args[])throws IOException,FileNotFoundException
		{
			int i,l,n,s;
			File f1=new File("/home/exam/OddEven/");
			File f2=new File("/home/exam/even.txt/");
			File f3=new File("/home/exam/odd.txt/");
			FileInputStream fin=new FileInputStream(f1);
			FileOutputStream fout1=new FileOutputStream(f2);
			FileOutputStream fout2=new FileOutputStream(f3);
			do
			{
				i=fin.read();
				if(i%2==0)
				fout1.write(i);
				else
				fout2.write(i);
			}while(i!=-1);
			fin.close();
			fout1.close();
			fout2.close();
		}
	}
