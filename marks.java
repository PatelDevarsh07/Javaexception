package j11exception;

import java.util.Scanner;

class myerr1 extends Exception
{
	public String toString()
	{
		return "You entered English marks below 0";		
	}
}
class myerr2 extends Exception
{
	public String toString()
	{
		return "You entered Hindi marks below 0";		
	}
}
public class marks {

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
		 throw new myerr1();
	 }
	 else if(hindi<0)
	 {
		 throw new myerr2();
	 }
	 else
	 {
		 System.out.println("Total=>"+(english+hindi));
	 }
	}
	catch(Exception ex)
	{
		System.out.println("Error"+ex.toString());
	}
   }
}
