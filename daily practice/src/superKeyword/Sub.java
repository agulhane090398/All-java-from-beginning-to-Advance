package superKeyword;

class Super
{
	int x=10;
	
}

class Sub extends Super 
{
	int x=20;
	
	void print()
	{
		int x=30;
		System.out.println(x);	//30
		System.out.println(this.x);	//20
		System.out.println(super.x);	//10
		
	}
	public static void main(String[] args) 
	{
		Sub a=new Sub();
		a.print();
	}
}

