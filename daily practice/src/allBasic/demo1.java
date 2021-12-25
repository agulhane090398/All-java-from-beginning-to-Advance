package allBasic;

import java.util.HashMap;
import java.util.Iterator;

public class demo1 {
	
	public static void main(String[] args) {
		
		String s="agdnkabdsk";
		printDuplicateChar(s);
		
	}
	
	public static void printDuplicateChar(String s)
	{
		HashMap <String,Integer> hm=new HashMap<>();
		
		String []a=s.split("");
		
		for(String str:a)
		{
			if(hm.get(str)!=null)
			{
				hm.put(str, hm.get(str)+1);
			}
			else
			{
				hm.put(str, 1);
			}
		}
		
		Iterator<String> i=hm.keySet().iterator();
		while(i.hasNext())
		{
			String temp=i.next();
			if(hm.get(temp)>1)
			{
				System.out.println(temp);
			}
		}
		
	}

}
