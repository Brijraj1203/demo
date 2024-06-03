package java_Programms;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {
	public static void main(String[] args) {
		String s="abcdefg";
		System.out.println("String: "+s);
		String s1="";
		reverseWithoutUsingLength(s);
		
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			System.out.print(s.charAt(i));
//			s1=s1+s.charAt(i);
//			
//		}
//		System.out.println("\n"+s1);
	}
	public static void reverseWithoutUsingLength(String str)
	{
		int length=0;
		for(int i=0;;i++)
		{
			try {
				str.charAt(i);
				length++;
			}
			catch (Exception e) {
				for(int j=length-1;j>=0;j--)
				{
					System.out.print(str.charAt(j));
				}
				break;
			}
		}
		
		
	}

}
