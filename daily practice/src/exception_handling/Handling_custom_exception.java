package exception_handling;

import java.util.Scanner;

@SuppressWarnings("serial")
class MaxInputException extends Exception
{
	public String toString()
	{
		return " Max Input Exception occured";
	}
}

public class Handling_custom_exception 
{

	private static final Exception MaxInputException = null;


	static 
	{
		System.out.println("Menu");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
	}
	
	public static void add(float a,float b)
	{
		System.out.println(a+b);
	}
	
	public static void sub(float a,float b)
	{
		System.out.println(a-b);
	}
	
	public static void mul(float a,float b)
	{
		System.out.println(a*b);
	}
	public static void div(float a,float b)
	{
//		try
		{
			System.out.println(a/b);
		}
//		catch(ArithmeticException e)
//		{
//			System.out.println("Trying to divide by zero");
//		}
	}
	
	
	public static void main(String[] args) throws Exception
	{
		try (// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in)) {
			System.out.print("Enter your choice: ");
			int ch=s.nextInt();
			System.out.print("Enter the value of a&b: ");
			float a=s.nextFloat();
			float b=s.nextFloat();
			
			if (a>100000 || b>10000) {
				throw MaxInputException;
			}
			switch(ch)
			{
			case 1:
				add(a,b);
				break;
				
			case 2:
				sub(a,b);
				break;
				
			case 3:
				mul(a,b);
				break;
				
			case 4:
				div(a,b);
				break;
			}
		} 
		catch (MaxInputException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e);
			System.out.println(" Max Input Exception occured");
			
		}
		System.out.println("After catch");

	}

}
