package finalKeyword;

public class FinalObject 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		final FinalKeyword1 f=new FinalKeyword1(4,6,8);
		System.out.println(f); 	//4,6,8
//		f.x=50; 	//error--> due to private
		f.y=50;		//object value can be changed because we have provided reference not object
		System.out.println(f); //4,50,8
		
		FinalKeyword1 f1=new FinalKeyword1(40,60,80);
		FinalKeyword1 f2=new FinalKeyword1(2,100,6);
		System.out.println(f2);
//		f=f1;	//The final local variable f cannot be assigned
		f2=f1;	// both are non final
		System.out.println(f2);
	}

}

class FinalKeyword1
{
//	private int x,y,z;
	int x,y,z;
	void show()
	{
//		x=10;	//error-->final can be initiated in constructor
	}
	public FinalKeyword1(int a,int b,int c) 
	{
		// TODO Auto-generated constructor stub
		this.x=a;
		this.y=b;
		this.z=c;
	}
	public String toString()
	{
		return ("values= "+x+" "+y+" "+z);
		
	}
	

}
