package j11exception;

import java.util.Scanner;

class myerror extends Exception
{
	public String toString() 
	{
		return "  please enter shorter address "; 
	}
}
public class address {

	public static void main(String[] args) {
		
		try 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your address=>");
			String s=sc.nextLine();
			System.out.println("Your address is=>" +s);
            if(s.length()>=3) 
            {
            	throw new myerror();
            	
            }
		}
		catch(Exception ex)
		{
			System.out.println("Error"+ex.toString());			
		}
	}
}
