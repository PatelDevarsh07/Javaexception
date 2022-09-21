package j11exception;

import java.util.Scanner;

class error1 extends Exception
{
	public String toString() 
	{
		return "  you have entered negative value."; 
	}
}
public class arraynegative {

	public static void main(String[] args) {
		
		try 
		{
			int a1[]=new int[5];
			Scanner sc=new Scanner(System.in);
			for(int i=0;i<5;i++) 
			{
				System.out.println("enter the values in array=>");
				a1[i]=sc.nextInt();		
				if(a1[i]<0) 
				{
				throw new error1();	
				}
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
	}
}
