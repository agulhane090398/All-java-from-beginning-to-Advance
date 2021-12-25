package shapes;

class Shapes1
{
	Shapes1()
	{
		System.out.println("In Shapes");
	}
}
class Circle extends Shapes1
{
	Circle()
	{
		System.out.println("In circle");
	}
}
class Square extends Shapes1
{
	Square()
	{
		System.out.println("In square");
	}
}
public class Shapes
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new Square();
		new Circle();
		

	}
}

