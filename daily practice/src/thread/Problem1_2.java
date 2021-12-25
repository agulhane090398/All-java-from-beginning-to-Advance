package thread;

class A extends Thread
{
	public void run()
	{
		while(true)
		{
			try {
				sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			System.out.println("I m Class A!");
		}
	}
}

class B extends Thread
{
	public void run()
	{
		while(true)
		{
			try {
				sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			System.out.println("Class B!");
	}
}
}
public class Problem1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		B b=new B();
		
		a.start();
		b.start();
	}

}
