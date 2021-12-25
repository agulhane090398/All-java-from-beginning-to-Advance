package lambdaFunction;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateType {

	public static void main(String[] args) {
//		Demo 1
		Predicate <Integer> p=i->i>10;
		System.out.println(p.test(5));
		System.out.println(p.test(15));
		
		System.out.println("\n");
		
//		Demo2
		Predicate<String> pr=s->s.length()>4;
		System.out.println(pr.test("Welcome"));
		System.out.println(pr.test("God!"));
		System.out.println("\n");
		
//		Demo 3
		Predicate<String> pp=s->s.length()>4;
		
		String []a= {"John","David","Marry","Sam","Wick"};
		for(String i:a)
		{
			if(pp.test(i))
			{
				System.out.println(i);
			}
		}
		System.out.println("\n");
		
//		Demo 4
		int []b= {5,10,15,20,40,45,50,55,60,65};
		
		Predicate<Integer> prr1=i->i%2==0;
		Predicate<Integer> prr2=i->i>50;
		//and
		for(int c:b)
		{
			if(prr1.and(prr2).test(c))
			{
				System.out.println(c);
			}
		}
		System.out.println("\n");

		//or
		for(int c:b)
		{
			if(prr1.or(prr2).test(c))
			{
				System.out.println(c);
			}
		}
		System.out.println("\n");

		//negate
		for(int c:b)
		{
			if(prr1.negate().test(c))
			{
				System.out.println(c);
			}
		}
		
//		Demo 5
		Predicate<Employee> pe=e->(e.salary>30000 && e.experience>2);
		
		ArrayList<Employee> al=new ArrayList();
		al.add(new Employee("john",50000,5));
		al.add(new Employee("David",20000,1));
		al.add(new Employee("Scott",30000,3));
		al.add(new Employee("sam",35000,2));
		
		for(Employee e:al)
		{
			if(pe.test(e))
			{
				System.out.println(e.ename+"   "+e.salary);
			}
		}
	}

}
class Employee
{
	String ename;
	int salary;
	int experience;
	
	public Employee(String ename,int salary,int experience) 
	{
		this.ename=ename;
		this.salary=salary;
		this.experience=experience;
	}
}