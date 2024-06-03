package java_Programms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringFrequencyRelated {
	public static void main(String[] args) {
		String s="abaxyba";
		System.out.println("Given String: "+s);
		Map<Character,Integer> m=countFrequency(s);
		System.out.println(m);
		for (Entry<Character, Integer> set : m.entrySet()) {
			if(set.getValue()==1)
			System.out.println(set.getKey()+" "+set.getValue());
		}
//		String stringWithouDup="";
//		String duplicateChar="";
//		String uniquChar="";
//		
//		for(char p: m.keySet())
//		{
//			stringWithouDup=stringWithouDup+p;
//			if(m.get(p)>1)
//				duplicateChar=duplicateChar+p;
//			else
//				uniquChar=uniquChar+p;
//		}
//		System.out.println(stringWithouDup);
//		System.out.println(duplicateChar);
//		System.out.println(uniquChar);
		
	}
	public static Map<Character, Integer> countFrequency(String s)
	{
		char[] chars=s.toCharArray();
		Map<Character,Integer> m=new HashMap<Character, Integer>();
		for(char c:chars)
		{
			if(!m.containsKey(c))
			{
				
				m.put(c, 1);
			}				
			else
			{
				m.put(c, m.get(c)+1);
			}
			
		}
		
		return m;
	}

   

}
