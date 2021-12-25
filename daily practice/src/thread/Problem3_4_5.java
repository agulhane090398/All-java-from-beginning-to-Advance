package thread;

class C extends Thread
{
	public void run()
	{
//		while(true)
		{		
			System.out.println("I m Class A!");
		}
	}
}

class D extends Thread
{
	public void run()
	{
//		while(1)
		{
			System.out.println("Class B!");
			
	}
}
}

public class Problem3_4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C a=new C();
		D b=new D();

//		que3
//		a.setPriority(6);
//		b.setPriority(8);
		
		a.start();
		b.start();
		
//		que 4
		System.out.println(a.getPriority());
		System.out.println(Thread.currentThread().getState());
		System.out.println(b.getPriority());
		
//		que 5
		
		System.out.println(Thread.currentThread().getState());
	}

}
