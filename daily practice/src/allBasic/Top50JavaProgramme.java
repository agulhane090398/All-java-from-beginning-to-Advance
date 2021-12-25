package allBasic;

import java.util.Stack;

public class Top50JavaProgramme {

	public static void main(String[] args) {

		int i = -4;
		String s = "ABCDBA";
		String s1 = "{sdc(vs[[ds]vd]vsd)csd}";
		
		int []a= {10,10,20,30,40,10};
		
		// fibonacciSeries(i);
		// primeOrNot(i);
		//removeDuplicateFromArray(a);
		//System.out.println(factorial(i));
		// System.out.println(palindrome(s));
		// System.out.println(integerPalindrome(i));
		// System.out.println(amtromeNumber(i));
		
		System.out.println(braceVerification(s1));
	}
	
	public static String braceVerification(String s1)
	{
		if(s1.isEmpty())
			return "No Braces";
		Stack<Character> st=new Stack<>();
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			if(c=='(' || c=='{' || c=='[')
			{
				System.out.println(c+" = push");
				st.push(c);
			}
			else if((c==')' && st.peek().equals('(')) || (c=='}' && st.peek().equals('{')) || (c==']' && st.peek().equals('[')))
			{
				if(!st.isEmpty()) {
					System.out.println(c+" = pop");
					st.pop();}
				else
					return "Stack is Empty";
			}
			else if(c==')' || c=='}' || c==']')
			{
				return "Corresponding Stack is not available";
			}
		}
		if(!st.isEmpty())
			return "Stack is not Yet Empty";
		return "Correct";
	}
	
	public static void removeDuplicateFromArray(int []a)
	{
		int[] b=new int[a.length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			boolean flag=false;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					flag=true;
				}
			}
			if(!flag)
			{
				b[k]=a[i];
				k++;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(b[i]);
		}
	}


	public static int factorial(int n) {
		int res = 1;
		if (n <= 0)
			return -1;
		for (int i = n; i > 1; i--) {
			res *= i;
		}
		return res;
	}

	public static boolean amtromeNumber(int n) {
		int len = String.valueOf(n).length();
		int res = 0;
		int m = n;
		while (n > 0) {
			int d = n % 10;
			res += Math.pow(d, len);
			n = n / 10;
		}
		System.out.println(res);
		if (m == res)
			return true;
		return false;
	}

	public static boolean integerPalindrome(int n) {

		String s = "" + n;
		String rev = "";
		for (int i = 0; i < s.length(); i++)
			rev = s.charAt(i) + rev;
		if (s.equals(rev))
			return true;
		else
			return false;
	}

	public static boolean palindrome(String s) {
		String rev = "";
		for (int i = 0; i < s.length(); i++) {
			rev = s.charAt(i) + rev;
		}
		if (s.equals(rev)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean primeOrNot(int n) {
		boolean flag = true;
		if (n == 1 || n == 0) {
			flag = false;
		} else if (n == 2) {
			flag = true;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not a Prime Number");
		}
		return flag;
	}

	public static void fibonacciSeries(int n) {
		int a = 0;
		int b = 1;
		int c = a + b;
		for (int i = 0; i < n; i++) {
			System.out.println(b);
			a = b;
			b = c;
			c = a + b;
		}

	}
}
