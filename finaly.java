package j11exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class finaly {

	public static void main(String[] args) {
		
		try 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number");
			int n=sc.nextInt();
			System.out.println("enter the number ");
			int m=sc.nextInt();
			int a=n/m;
			System.out.println(a);

		}
		catch(InputMismatchException ex) 
		{
 			System.out.println("plz enter numbers");
		}
		catch(ArithmeticException ex) 
		{
			System.out.println("why you entered 0");
		}
		catch(Exception ex) 
		{
			System.out.println("Error"+ex.toString());
		}
		finally 
		{
			System.out.println("in finally");
      	}
	}
}
