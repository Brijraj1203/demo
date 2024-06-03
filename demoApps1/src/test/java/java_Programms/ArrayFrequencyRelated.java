package java_Programms;

import java.util.HashMap;
import java.util.Map.Entry;

public class ArrayFrequencyRelated {

	public static void main(String[] args) {
		int[] a= {1,1,1,2,2,3,3,4,2,8};
		//int[]a= {1,2,3,4,5};
		int max=0;
		int count=0;
		HashMap<Integer, Integer> m=new HashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(m.containsKey(a[i]))
				m.put(a[i], m.get(a[i])+1);
			else
				m.put(a[i], 1);
		}
		System.out.println(m);
		for(Entry<Integer, Integer> m1:m.entrySet())
		{
			if(m1.getValue()>1) {
				System.out.println(m1.getKey()+" "+m1.getValue());
				count=1;
				if(m1.getValue()>max)
					max=m1.getValue();
			}
				
		}
		if(count==0)
		{
			System.out.println("Array contains unique elements  -1");
		}
		System.out.println(max);

	}

}
