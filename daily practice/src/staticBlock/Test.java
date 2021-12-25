package staticBlock;


//class Demo1
//{
//static int x;
//{
//System.out.println("block1");
//}
//static
//{
//System.out.println(x);
//System.out.println("block2");
//}
//public static void show()
//{
//System.out.println("in show()");
//}
//public static void main(String[] args)
//{
//show();
//new Demo1();
//}
//}




class A
{
class B
{
static void show()
{
System.out.println("welcome");
}
}
}
class Test
{
@SuppressWarnings("static-access")
public static void main(String[] args)
{
	new A().new B().show();
	
	
}
}












//class Derived
//{
// protected final void getDetails()
// {
// System.out.println("Derived class");
// }
//}
//public class Test extends Derived
//{
// protected final void getDetails(int x)
// {
// System.out.println("Test class");
// }
// public static void main(String[] args)
// {
// Derived obj = new Derived();
// obj.getDetails();
// }
//}





//class Demo1
//{
// public void m1 (int i,float f)
//{
// System.out.println(" int float method");
//}
//public void m1(float f,int i)
//{
// System.out.println("float int method");
//}
//public static void main(String[]args)
// {
//	Demo1 s=new Demo1();
//s.m1(20,20);
// }
//}
