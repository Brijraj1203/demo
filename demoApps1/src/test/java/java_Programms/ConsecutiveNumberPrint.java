package java_Programms;

import java.util.ArrayList;

public class ConsecutiveNumberPrint {

	public static void main(String[] args) {
		String s="q1238167899";
		for(int i=0;i<s.length();)
		{
			String ne="";
			int count=0;
			char c = s.charAt(i);
			if(c>='0' && c<='9')
			{
				ne=ne+c;
				count++;
				for(int j=i+1;j<s.length();j++)
				{
					if(s.charAt(j)-s.charAt(j-1)==1)
					{
						ne=ne+s.charAt(j);
						count++;
					}
					
					else
					{
						if(ne.length()>1)
						System.out.println(ne);
						break;
					}
						
				}
				i=i+count;
				
				
			}
			else
			{
				i++;
			}
		}
		

	}

}
