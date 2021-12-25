package staticBlock;

public class Demo 
{
	int j;
	static int x=1;
	static
	{
		x=10;
		System.out.println(x);	//10
	}
	static
	{
		x=100;
		System.out.println(x);//100
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(x);	//100


	}

}
