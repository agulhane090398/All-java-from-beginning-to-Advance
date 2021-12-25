package typesOfMethod;

public class Demo 
{
	int x=40;
	Demo(int x1)
	{
		x=x1;
	}
	public void change(int y)	//mutator
	{
		x=y;
	}
	public int getchange()	//accessor
	{
		return x;
	}
	public void display()	//accessor
	{
		System.out.println(x);;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Demo d=new Demo(10);
		d.display();	//10
		
		d.change(100);
		d.display();	//100
		
		d.getchange();
		d.display();	//100
		

	}

}
