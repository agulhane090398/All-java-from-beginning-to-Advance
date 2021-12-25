package finalKeyword;

public class FinalStatic 
{
	final static int x;
	void show()
	{
//		x=10;	//error-->non static method
	}
	static void show1()
	{
//		x=10;	//The final field FinalStatic.x cannot be assigned in method
	}
	public FinalStatic() 
	{
		// TODO Auto-generated constructor stub
//		x=10;	//error-->non static method
	}
	
	static
	{
		x=15;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(x);

	}

}
