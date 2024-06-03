package rakutan;

import java.util.ArrayList;
import java.util.Scanner;

public class BracketBalancing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		System.out.println(s);
		ArrayList<Character> l=new ArrayList<Character>();
		for(int i=0;i<s.length();i++)
		{
			if(l.size()!=0)
			{
				if((s.charAt(i)=='}' && l.get(l.size()-1)=='{')
					||	(s.charAt(i)==']' && l.get(l.size()-1)=='[')
					|| (s.charAt(i)==')' && l.get(l.size()-1)=='('))
				{
					l.remove(l.size()-1);
				}
				else
				{
					l.add(s.charAt(i));
				}
			}
			else
			{
				l.add(s.charAt(i));
			}
		}
		if(l.size()==0)
			System.out.println("Balanced");
		else
			System.out.println("Unbalanced "+l);

	}

}
