package lambdaFunction;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionType {

	public static void main(String[] args) {
//		Demo 1
		Function<Integer,Integer> f1=n->n*2;
		Function<Integer,Integer> f2=n->n*n*n;
		
		//andThen()
		System.out.println(f1.andThen(f2).apply(3));	//6		216
		//compose()
		System.out.println(f1.compose(f2).apply(3));	//27	54
		
//		Demo 2
		Predicate<Integer> pe=b->b>3500;
		
		Function<Employee1,Integer> f=e->{
			int sal=e.salary;
			if(sal>10000 && sal<=20000)
				return(sal*10/100);
			else if(sal>20000 && sal<=30000)
				return(sal*20/100);
			else if(sal>30000 && sal<=40000)
				return(sal*30/100);
			else
				return(sal*40/100);
		};
		
		ArrayList<Employee1> al=new ArrayList();
		al.add(new Employee1("john",50000,5));
		al.add(new Employee1("David",20000,1));
		al.add(new Employee1("Scott",30000,3));
		al.add(new Employee1("sam",35000,2));
		
		for(Employee1 e:al)
		{
			int bonus=f.apply(e);
			if(pe.test(bonus))
			{
				System.out.println(e.ename+"   "+e.salary+"   "+bonus);
			}
		}
	}

}
class Employee1
{
	String ename;
	int salary;
	int experience;
	
	public Employee1(String ename,int salary,int experience) 
	{
		this.ename=ename;
		this.salary=salary;
		this.experience=experience;
	}
}