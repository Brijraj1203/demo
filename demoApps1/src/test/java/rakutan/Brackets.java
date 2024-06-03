package rakutan;

import java.util.Scanner;

public class Brackets {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		System.out.println(s);
		int curly_count=0;
		int sq_count=0;
		int pr_count=0;
		
		for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='{' )
					curly_count++;
				if(s.charAt(i)=='(')
					pr_count++;
				if(s.charAt(i)=='[')
					sq_count++;
				if(s.charAt(i)=='}')
					curly_count--;
				if(s.charAt(i)==']')
					sq_count--;
				if(s.charAt(i)==')')
					pr_count--;
			}
			if(curly_count==0 && sq_count==0 && pr_count==0)
				System.out.println("VAlid String");
			else
				System.out.println("Invalid string");
		
		
	}

}
