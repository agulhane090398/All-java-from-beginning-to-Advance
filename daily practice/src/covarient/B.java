package covarient;

//	private--->default--->protected---->public
//	more restriction --------->less restriction

class A
{
	protected void show()
	{
		System.out.println("hi");
	}
}


class B extends A
{
	public void show()	//use (less or same)restricted access specifier
	{
		System.out.println("byee");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		B b=new B();
		b.show();	//byee
	}
}
