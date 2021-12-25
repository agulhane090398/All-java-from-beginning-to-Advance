package collections;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class ArrayList1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Que 1
		@SuppressWarnings({ "rawtypes", "unchecked" })
		ArrayList<String> al= new ArrayList();
		
		al.add("Aniket");
		al.add("Yash");
		al.add("Advait");
		
		System.out.println(al);	//Array form
		
		al.remove("Advait");
		
		for (String s:al)
		{
			System.out.println(s);	//object
		}
		al.clear();//deletes all
		
		//Que 2
		@SuppressWarnings({ "rawtypes", "unchecked" })
		HashSet<Integer> s=new HashSet();
		s.add(5);
		s.add(10);
		s.add(15);
		s.add(20);
		s.add(5);	//no duplication
		s.add(18);
		
		System.out.println(s);
		
		//Que 3
		Date d=new Date();
		System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
		
		//Que 4
		Calendar c=Calendar.getInstance();
		System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
		
		//Que 5
		DateTimeFormatter df=DateTimeFormatter.ISO_LOCAL_TIME;
		DateTimeFormatter df2=DateTimeFormatter.ofPattern("H:m:s");
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		String ds=dt.format(df);
		String ds2=dt.format(df2);
		System.out.println(ds);
		System.out.println(ds2);
		
		//EXAMPLe
//		  LocalDate date = LocalDate.now();
//		  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
//		  String text = date.format(formatter);
//		  LocalDate parsedDate = LocalDate.parse(text, formatter);
		
	}

}
