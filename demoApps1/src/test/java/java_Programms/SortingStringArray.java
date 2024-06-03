package java_Programms;
import java.util.Arrays;



public class SortingStringArray {
	public static void main(String[] args) {
		//int[] a= {3,5,2,1,2};
		String[] a= {"abc","xyabc","ab","a","ab"};
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				int l1=a[j].length();
				int l2=a[j+1].length();
				if(l1>l2)
				{
					String temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("longest string: "+a[a.length-1]);
		
	}

}
