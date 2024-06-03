package java_Programms;

public class Patterns {

	public static void main(String[] args) {
		triangle();
		System.out.println("-------------------------");
		triangle2();
		System.out.println("-------------------------");
		pyramid();
		System.out.println("-------------------------");
		triangle3();
		System.out.println("-------------------------");
		//triangle4();

	}
	public static void triangle()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				//if(j<=i)
					System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void triangle2()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i+j>=6)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	public static void triangle3()
	{
		int n=1;
		for(int i=1,j=1;i<=5;)
		{
			
			if(j<=i)
			{
				System.out.print(n+" ");
				n++;
				j++;
			}
			else
			{
				System.out.println();
				n=1;
				j=1;
				i++;
				
			}
				
		}
	}
//	public static void triangle4()
//	{
//		for(int i=1,j=1;i<=5;)
//		{
//			
//			if(i+j<=6)
//			{
//				System.out.print("  ");
//				j++;
//			}
//			else
//			{
//				System.out.print("* ");
//				j++;
//				if(j==5)
//				{
//					System.out.println();
//					j=1;
//					i++;
//				}
//					
//				
//			}
//				
//		}
//	}
	public static void pyramid()
	{
		int space=5-1;
		int star=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
					System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			space--;
			star++;
			System.out.println();
		}
	}

}
