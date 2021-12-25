package runTimeBinding;

class A
{
	int x=10;
	void print()
	{
		System.out.println("A Class");
	}
}
class B extends A
{
	int y=20;
	void print()
	{
		System.out.println("B Class");
	}
	void show()
	{
		System.out.println("show method in C");
	}
}
class C extends B
{
	int z=30;
	void print()
	{
		System.out.println("C Class");
	}
//	int print()	//The return type is incompatible with B.print()
//	{
//		System.out.println("C Class");
//		return 1;
//	}
	void show()
	{
		System.out.println("show method in C");
	}
}
public class CheckTheMethodReaction 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		A ref=new B();
		ref.print();	//B class print is envoked thru object datatype
//		ref.show();		//error-->only the overriden methods can called
		
		B ref2=new C();
		ref2.show();	//show method in C -->of c class
		ref2.print();	//C Class-->of c class
	}
}
