import java.io.*;
import java.util.Scanner;
class Check
	{
		public static void main(String args[])throws IOException,FileNotFoundException
		{
			int i,l,n,s;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the limit for storing the number");
			l=sc.nextInt();
			Check c=new Check();
			int[] arr=new int[l];
								
					System.out.println("enter the numbers");
					n=sc.nextInt();
			for(i=0;i<=n;i++)
				{

					arr[i]=sc.nextInt();
				}
			FileWriter fw=new FileWriter("/home/exam/OddEven/");
			FileReader fr=new FileReader("/home/exam/OddEven/");
			BufferedReader br=new BufferedReader("/home/exam/OddEven/");
			if(s=br.readLine())
			{
				System.out.println("succefully read");
			}
			else
			{
				System.out.println("error");
			}	
			fw.close();
			fr.close();
			File f1=new File("/home/exam/OddEven/");
			File f2=new File("/home/exam/even.txt/");
			File f3=new File("/home/exam/OddEven.txt/");
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
