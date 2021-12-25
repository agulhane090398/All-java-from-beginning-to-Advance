package allBasic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;



public class Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String str="I am am a a Java Coder Coder Coder";
		String strC="I am am";
		
		String str1="One space Two  space 3   space";
		String s="HiHowAreYou";
		String p="NITPIN";
		String s1="I am am ssds266sv \n v56";
		char c='b';
		int i=123;
		String ii="123";
		
		//findDuplicateWordInString(str);
		//findDuplicateCharInString("jaavajeee");
//		anagram("sarp","raps");
		//noOfWords(str);
		//noOfOccurenceOfChar(str, c);
		//reverseCharString(str);
		//reverseCharStringRecursion(s);
		//reverseString(str);
		//romoveAllSpaces(str1);
		//parseIntegerFromString(s1);
		//firstNonRepeatedCharInString(s);
		//firstNonRepeatedCharInString2(s1);
		//removeDuplicateChar(s);
		//stringContainsAnotherString(str , strC);
		//stringContainsAnotherStringLogic(str , strC);
		//removeAGivenCharacterOfString(str1,c);
		//sortAString(s);
		
		//countNoOfVowelConsonent(str);
//		stringContainsOnlyDigit(s1);
//		permutationOfAString(s);
		//reverseAnInteger(i);
		//palindrome(p);
		//stringToInteger(ii);
		//integerToString(i);
		
		
		//appendGivenStringToFile(str);
		//printFileToConsole();
		//repeatedWordsInFile();
		//NoOfCWLinFile();
		
		
		System.out.println(superDigit("593", 7));
	}
	
	public static int superDigit(String n, int k) {
		
		String num="";
        while(k>0)
        {
            num=num+n;
            k--;
        }
        BigInteger a=BigInteger.valueOf(Long.parseLong(num));
        long sum=0 , d=0;
//
//        while(a>0)
//        {
//            d=a%10;
//            sum+=d;
//            a=a/10;
//        }
//        if(sum>9)
        {
            return superDigit(sum+"", 1);
        }
//        else
//        {
//            return (int)sum;
//        }   
	}
	
	public static void NoOfCWLinFile() throws IOException
	{
		String path="filename.txt";
		String s="";
		int count=0;
		BufferedReader br=new BufferedReader(new FileReader(path));
		while(br.ready())
		{
			s+=br.readLine()+" ";
			count+=1;
		}
		System.out.println(s);
		//no of char
		char[] c=s.toCharArray();
		System.out.println("Total character in File = "+c.length);
		
		//no of Word
		String[] w=s.split(" ");
		System.out.println("Total words in File = "+w.length);
		
		//no of line
		System.out.println("Total lines in File = "+count);
		
	}
	
	public static void repeatedWordsInFile() throws IOException
	{
		String path="filename.txt";
		String a="";
		BufferedReader br=new BufferedReader(new FileReader(path));
		while(br.ready())
		{
			a+=br.readLine()+" ";
		}
		System.out.println(a);
		String b[]=a.split(" ");
		HashMap<String, Integer> hm=new LinkedHashMap<>();
		for(String c:b)
		{
			if(hm.get(c)!=null)
			{
				hm.put(c, hm.get(c) + 1);
			}
			else
			{
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
		
		Iterator<String> ii=hm.keySet().iterator();
		while(ii.hasNext())
		{
			String temp=ii.next();
			if(hm.get(temp)>1)
			{
				System.out.println(temp+" = "+(hm.get(temp)));
			}
		}
		br.close();
	}
	
	public static void sortAString(String a)
	{
		char[] s=a.toCharArray();
		for(int i=0;i<s.length-1;i++)
		{
			for(int j=0;j<s.length-i-1;j++)
			{
				if(s[j]>s[j+1])
				{
					char temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}
		for(int i=0;i<s.length;i++) {
		System.out.print(s[i]);
		}
	}
	
	
	public static void removeAGivenCharacterOfString(String str,char c)
	{
		System.out.println(str.replaceAll("c", ""));
	}

	
	
	public static void stringContainsAnotherStringLogic(String str ,String s1)
	{
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==s1.charAt(0))
			{
				boolean flag=true;
				for(int j=0;j<s1.length();j++)
				{
					if(str.charAt(i)!=s1.charAt(j))
					{
						flag=false;
						break;
					}
					i++;
				}
				if(flag)
				{
					System.out.println("Yes");
				}
			}
		}
	}
	
	public static void stringContainsAnotherString(String str ,String s1)
	{
		if(str.contains(s1))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

	
	
	public static void printFileToConsole() throws IOException
	{
		String path="filename.txt";
		
		BufferedReader bw=new BufferedReader(new FileReader(path));//true=append
		while(bw.ready())
		{
			System.out.println(bw.readLine());
		}
		bw.close();
	}

	
	public static void appendGivenStringToFile(String s) throws IOException
	{
		String path="filename.txt";
		
		BufferedWriter bw=new BufferedWriter(new FileWriter(path,true));//true=append
		System.out.println("Appended");
		bw.write("\n"+s);
		bw.close();
	}

	
	
	
	public static void removeDuplicateChar(String s)
	{
		String a="";
		HashMap<Character, Integer> hm=new LinkedHashMap<>();
		for(int i=0;i<s.length();i++) 
		{
			if(hm.get(s.charAt(i))!=null)
			{
				hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
			}
			else
			{
				hm.put(s.charAt(i), 1);				
			}
		}
		System.out.println(hm);
		
		for(Entry<Character,Integer> e:hm.entrySet())
		{
			if(e.getValue()==1)
			{
				a=a+e.getKey();
			}
		}
		System.out.println(a);
	}

	
	
	
	
	public static void integerToString(int ii)
	{
		String a=String.valueOf(ii);
		System.out.println(a);
	}
	
	public static void stringToInteger(String ii)
	{
		int a=Integer.parseInt(ii);
		System.out.println(a);
	}

	
	public static void palindrome(String p)
	{
		int l=0;
		int r=p.length()-1;
		boolean flag=true;
		while(flag)
		{
			if(l>=r)
			{
				System.out.print("Palindrom");
				flag=false;
			}
			else if(p.charAt(l)==p.charAt(r))
			{
				l++;
				r--;
			}
			else
			{
				System.out.print("Not Palindrom");
				flag=false;
			}
		}
	}

	
	public static void reverseAnInteger(Integer i) {
		int res=0;
		int d=0;
		while(i>0)
		{
			d=i%10;
			res=res*10+d;
			i=i/10;
		}
		System.out.println(res);
	}

	
	
	public static void permutationOfAString(String s)
	{
		System.out.println("Remaining");
	}

	
	
	public static void countNoOfVowelConsonent(String s)
	{
		int vowel=0;
		int consonent=0;
		String a=s.toLowerCase().replaceAll("\\d", " ");
		for(int i=0;i<s.length();i++)
		{
			if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u')
			{
				vowel+=1;
			}
			else
			{
				consonent+=1;
			}
		}
		System.out.println("vowel="+vowel);
		System.out.println("consonent="+consonent);
	}

	
	public static void stringContainsOnlyDigit(String s)
	{
		System.out.println("Integer in String = "+Integer.parseInt(s.replaceAll("\\D", "")));
		System.out.println("Integer in String = "+Integer.valueOf(s.replaceAll("\\D", "")));
		System.out.println("Without Integer in String = "+s.replaceAll("\\d", ""));
		System.out.println("Without new line in String = "+s.replaceAll("\n", ""));
		System.out.println("Without Space in String = "+s.replaceAll("\\s", ""));
		System.out.println("Multiple replacement in String = "+s.replaceAll("[\\s,\\d]", " "));
	}
	
	
	public static void firstNonRepeatedCharInString2(String s)
	{
		Map<Character,Integer> m=new HashMap();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(m.containsKey(c))
			{
				m.put(c, m.get(c)+1);
			}
			else
			{
				m.put(c, 1);
			}
			
		}
		for(Entry<Character,Integer> entry:m.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.println("First Non Repeated Char In String2 is '"+entry.getKey()+"'");
				break;
			}
		}
	}

	
	
	public static void firstNonRepeatedCharInString(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count+=1;
					break;
				}
			}
			if(count==0)
			{
				System.out.println("First Non Repeated Char In String is '"+s.charAt(i)+"'");
				break;
			}
		}
	}

	
	public static void parseIntegerFromString(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			int a=s.charAt(i);
			if(a>47 && a<58)
			{
				System.out.print((char)a);
			}
		}
	}

	
	
	
	public static void romoveAllSpaces(String s)
	{
		System.out.println(s.replaceAll(" ", ""));
		
	}

	
	
	public static void reverseString(String s) {
		String a[]=s.split(" ");
		String s2="";
		
		for(int i=a.length-1;i>=0;i--)
		{
			s2+=(a[i]+" ");
		}
		System.out.println(s2);
	}

	
	
	
	public static void reverseCharString(String s) {
		String a="";
		for(int i=s.length()-1;i>=0;i--)
		{
			a+=s.charAt(i);
		}
		System.out.println(a);
	}
	
	
	public static void reverseCharStringRecursion(String s) {
		
		if(s==null || s.length()<=1)
		{
			System.out.print(s);
		}
		else
		{
			System.out.print(s.charAt(s.length()-1));			
			reverseCharStringRecursion(s.substring(0,s.length()-1));
		}
	
	}

	
	
	
	public static void noOfOccurenceOfChar(String s, char c)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char a=s.charAt(i);
			if(a==c)
			{
				count+=1;
			}
		}
		System.out.println("Count of "+c+" in String is "+count);
	}

	
	
	//No Of Words
	public static void noOfWords(String s)
	{
		String a[]=s.split(" ");
		System.out.println("Length = "+a.length);
	}

	
	
	//anagram
	public static void anagram(String s1, String s2)
	{
		if(s1.length()==s2.length())
		{
			HashMap<Character, Integer> hm1=new HashMap<>();
			HashMap<Character, Integer> hm2=new HashMap<>();
			for(int i=0;i<s1.length();i++)
			{
				char c1=s1.charAt(i);
				char c2=s2.charAt(i);
				
				if(hm1.get(c1)!=null)
				{
					hm1.put(c1, hm1.get(c1)+1);
				}
				else
				{
					hm1.put(c1, 1);
				}
				
				if(hm2.get(c2)!=null)
				{
					hm2.put(c2, hm2.get(c2)+1);
				}
				else
				{
					hm2.put(c2, 1);
				}
			}
			System.out.println(hm1.hashCode());
			System.out.println(hm2.hashCode());
			if(hm1.equals(hm2))
			{
				System.out.println("It is an Anagram");
			}
			else
			{
				System.out.println("Not an Anagram inner");
			}
			
		}
		else
		{
			System.out.println("Not an Anagram");
		}
	}
	
	
	//find Duplicate Char In String
	public static void findDuplicateCharInString(String s)
	{
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();

		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			
			if(hm.get(c)!=null)
			{
				hm.put(c, hm.get(c)+1);
			}
			else
			{
				hm.put(c, 1);
			}
			
		}
		Iterator<Character> i=hm.keySet().iterator();
		while(i.hasNext())
		{
			Character c=i.next();
			if(hm.get(c)>1)
			{
				System.out.println(c+" = "+hm.get(c));
			}
		}
	}
	
	
	//find Duplicate Word In String
	public static void findDuplicateWordInString(String s)
	{
		String []a=s.split(" ");
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		
		for(String c:a)
		{
			if(hm.get(c)!=null)
			{
				hm.put(c, hm.get(c)+1);
			}
			else
			{
				hm.put(c, 1);
			}
		}
		
		Iterator<String> i=hm.keySet().iterator();
		
		while(i.hasNext())
		{
			String temp=i.next();
			
			if(hm.get(temp)>1)
			{
				System.out.println(temp+" = "+hm.get(temp));
			}
		}
	}

}


