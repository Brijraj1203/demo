package java_Programms;

import java.util.Arrays;

public class ReverseWordsInAString {

	public static void main(String[] args) {
		String s="My Name Is Brijraj";
		String[] str=s.split(" ");
		String wordsInReverse="";
		System.out.println(Arrays.toString(str));
		for(int i=str.length-1;i>=0;i--)
		{
			wordsInReverse=wordsInReverse+str[i]+" ";
		}
		System.out.println(wordsInReverse);
		reverseEachWord(str);
		

	}
	public static void reverseEachWord(String[] str)
	{
		String s="";
		for(int i=0;i<str.length;i++)
		{
//			System.out.println(str[i]);
			String s1=str[i];
			for(int j=s1.length()-1;j>=0;j--)
			{
				s=s+s1.charAt(j);
			}
			s=s+" ";
		}
		System.out.println(s);
	}

}
