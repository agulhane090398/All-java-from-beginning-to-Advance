package staticBlock;

public class Students 
{
	int rollno;
	String name;
	static String collegename="COEP";
	public Students(int r,String n) 
	{
		// TODO Auto-generated constructor stub
		rollno=r;
		name=n;
	}
	public void display()
	{
		System.out.println(rollno+" "+name+" "+collegename);
	}
	public static void change()
	{
		collegename="VIT";
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Students a=new Students(1,"Aniket");
		Students a1=new Students(2,"Anish");
		
		a.display();
		a1.display();
		
//		a.change();		
		Students.change();
		
//		Students.display();	//static method can not call non static method with class name
		a.display();
		a1.display();
	}

}
