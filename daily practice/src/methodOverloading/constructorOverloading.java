package methodOverloading;

public class constructorOverloading 
{
	public constructorOverloading() //default constructor
	{
		// TODO Auto-generated constructor stub
		System.out.println("default constructor");
	}
	public constructorOverloading(int x)	//parametrised constructor
	{
		System.out.println("parametrised constructor"+" "+x);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		constructorOverloading s=new constructorOverloading();
		@SuppressWarnings("unused")
		constructorOverloading s1=new constructorOverloading(10);
		
	}

}
