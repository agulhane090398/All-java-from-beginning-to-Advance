package superKeyword;

class Person
{
	int id;
	String name;
	
	Person(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void display()
	{
		System.out.print(id+" "+name+" ");
	}
}


class Emp extends Person
{
	float sal;
	
	Emp(int id,String name,float sal)
	{
		super(id,name);
		this.sal=sal;
	}
	void display()
	{
		super.display();
		System.out.println(sal);
	}
}

public class Demo 
{

	public static void main(String[] args) 
	{
		Emp e=new Emp(1,"Aniket",50000.0f);
		e.display();
	}

}
