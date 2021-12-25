package finalKeyword;

class Emp
{
	private int emp_no;
	private String name;
	
	Emp()
	{
		emp_no=0;
		name="unknown";
	}
	public Emp(int emp_no,String name)
	{
		this.emp_no=emp_no;
		this.name=name;
	}
	
	public String toString() 
	{
		// TODO Auto-generated method stub
		return("Emp no= "+emp_no+" name= "+name);
	}
	public double computeSal()
	{
		return (0.0);
	}
}


class WageEmp extends Emp
{
	private int m_hrs;
	private int m_rate;
	
	public WageEmp()
	{
		m_hrs=0;
		m_rate=0;
	}
	public WageEmp(int m_hrs,int m_rate)
	{
//		super();	//implicitly
		this.m_hrs=m_hrs;
		this.m_rate=m_rate;
	}
//	use any one ^_^
	public WageEmp(int emp_no,String name,int m_hrs,int m_rate)
	{
		super(emp_no,name);	// provide Explicitly else will have super()
		this.m_hrs=m_hrs;
		this.m_rate=m_rate;
	}
	public String toString() 
	{
		// TODO Auto-generated method stub
		return(super.toString()+"m_hrs= "+m_hrs+" m_rate= "+m_rate);
	}
	public double computeSal()
	{
		return ((double)(m_hrs*m_rate));
	}
}



class SalesPerson extends WageEmp
{
	private double sales;
	private double com;
	
	public SalesPerson() 
	{
		sales=0;
		com=0;
	}
	public SalesPerson(int sales,int com)
	{
//		super();		//implicitly
		this.sales=sales;
		this.com=com;
	}
//	use any one ^_^
	public SalesPerson(int emp_no,String name,int m_hr,int m_rate,int sales,int com)
	{
		super( emp_no, name, m_hr, m_rate);// provide Explicitly else will have super()
		this.sales=sales;
		this.com=com;
	}
	public String toString() 
	{
		// TODO Auto-generated method stub
		return(super.toString()+"sales= "+sales+" com= "+com);
	}
	public double computeSal()
	{
		return ((double)(sales*com));
	}
}




public class Problem1 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WageEmp e=new WageEmp();
		System.out.println("WageEmp Salary="+e.computeSal());//0.0
		System.out.println(e);	//Emp no= 0 name= unknownm_hrs= 0 m_rate= 0
		
		System.out.println("---------------------------------------------");
		
		WageEmp e2=new WageEmp(100,30);
		System.out.println("WageEmp Salary="+e2.computeSal());//3000
		System.out.println(e2);	//Emp no= 0 name= unknownm_hrs= 100 m_rate= 30
		
		System.out.println("---------------------------------------------");
		
		WageEmp e1=new WageEmp(101,"Aniket",100,30);
		System.out.println("WageEmp Salary="+e1.computeSal());//3000
		System.out.println(e1);	//Emp no= 101 name= Aniketm_hrs= 100 m_rate= 30
		
		System.out.println("---------------------------------------------");
		
		SalesPerson s=new SalesPerson();
		System.out.println("Salesperson Salary="+s.computeSal());//0.0
		System.out.println(s);//Emp no= 0 name= unknownm_hrs= 0 m_rate= 0sales= 0.0 com= 0.0
		
		System.out.println("---------------------------------------------");
		
		SalesPerson s1=new SalesPerson(200,3);
		System.out.println("Salesperson Salary="+s1.computeSal());//600.0
		System.out.println(s1);//Emp no= 0 name= unknownm_hrs= 0 m_rate= 0sales= 200.0 com= 3.0
		
		System.out.println("---------------------------------------------");
		
		SalesPerson s2=new SalesPerson(102,"Anish",105,20,200,3);
		System.out.println("Salesperson Salary="+s2.computeSal());//600.0
		System.out.println(s2);//Emp no= 102 name= Anishm_hrs= 105 m_rate= 20sales= 200.0 com= 3.0
	}

}
