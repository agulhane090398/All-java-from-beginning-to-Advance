package finalKeyword;

public class FinalKeyword 
{
	final int x;
	void show()
	{
//		x=10;	//error-->final can be initiated in constructor
	}
	public FinalKeyword() 
	{
		// TODO Auto-generated constructor stub
		x=10;
	}
	public static void main(String[] args) 
	{
		System.out.println(new FinalKeyword().x);
	}

}
