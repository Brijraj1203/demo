package java_Programms;

import java.util.Arrays;

public class ArrayProg {

	public static void main(String[] args) {
		int a[]= {7,3,4,1,5,6};
		System.out.println("In Ascending Order:");
		ascendingOrder(a);
		System.out.println("In Descendng Order");
		descendingOrder(a);
		

	}
	public static void ascendingOrder(int[] a )
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("maximum="+a[a.length-1]);
		System.out.println("minimum="+a[0]);
	}
	public static void descendingOrder(int[] a )
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]<a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
