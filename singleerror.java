package j11exception;

import java.util.Scanner;

class myerr extends Exception
{
	public String toString() 
	{
		return "  due to <0"; 
	}
}
public class singleerror {

	public static void main(String[] args) {
		
		try 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the marks of English=>");
			int english=sc.nextInt();
			System.out.println("Enter the marks of Hindi=>");
			int hindi=sc.nextInt();
			
			if(english<0) 
			{
				throw new myerr();
				
			}
			else if(hindi<0) 
			{
				throw new myerr();
			}
			else 
			{
				System.out.println("total=>"+(english+hindi));
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error"+ex.toString());			
		}	
	}
}
