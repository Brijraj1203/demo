package java_Programms;

import java.util.Arrays;

public class LongestStringInArrayWithoutSorting {

	public static void main(String[] args) {
		//int[] a= {3,5,2,1,4};
		
		String[] a= {"abc","xyabc","ab","a","ab"};
		int big=a[0].length();
		int index=0;
				System.out.println(Arrays.toString(a));
				for(int i=0;i<a.length;i++)
				{
					if(big<a[i].length())
					{
						big=a[i].length();
						index=i;
					}
						
					
				}
				System.out.println("Biggest: "+a[index]);

	}

}
