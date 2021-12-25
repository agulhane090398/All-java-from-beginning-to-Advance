package superKeyword;
class Superclass
{
	 int a=10;
	 static int b=20;
	 static void m1()
	 {
		 System.out.println(b);
		 System.out.println("superclass static ()");
	 }
	void m2()
	{
		System.out.println(b);
		System.out.println("super class nonstatic ()");
	}
}
class Subclass extends Superclass
{
	 int a=30;
	 static int b=40;
	 static void m1()
	 {
//		 super.m1(); 	//super keyword cannot be used inside static method or block
		 System.out.println("subclass static ()");
	 }
	void m2()
	{
		int a=50;
		System.out.println("sub class nonstatic ()");
		System.out.println(a);//50
		System.out.println(this.a);//30
		System.out.println(super.a);//10
		m1();//this.m1();
		super.m1();
	}
}

public class CheckStatic 
{
	public static void main(String[] args) 
	{
		Subclass sc=new Subclass();
		sc.m2();
		
	}
}
