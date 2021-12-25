package methodOverloading;

public class Demo 
{
	public void add(int x,int y)
	{
		System.out.println(x+y);
	}
//	public int add(int x,int y){}	//return type does not matters

	public void add(int x,float y)
	{
		System.out.println(x+y);
	}
	public void add(float x,int y)
	{
		System.out.println(x+y);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Demo d=new Demo();
		d.add(1, 50);
		d.add(1f, 50);
		d.add(1, 50f);
	}
}
