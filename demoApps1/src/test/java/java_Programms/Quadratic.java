package java_Programms;

import java.util.Arrays;

public class Quadratic {

	public static void main(String[] args) {
		String s="hi hello welcome abcde";
        String[] str = s.split(" ");
        System.out.println(Arrays.toString(str));
        String s1="";
        for(int i=0;i<str.length;i++)
        {
        	if(i==1)
        	{
        		s1=s1+str[i];
        	}
        	if(i==str.length-1)
        	{
        		s1=s1+" ";
        		String f=str[i];
        		for(int j=0;j<f.length()-1;j++)
        		{
        			s1=s1+f.charAt(j);
        		}
        	}
        }
        System.out.println(s1);

	}
	public static int power(int a,int b)
    {
        int prod=1;
        for(int i=1;i<=b;i++)
        {
            prod=prod*a;
        }
        return prod;
    }

}
