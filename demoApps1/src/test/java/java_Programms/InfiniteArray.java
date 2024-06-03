package java_Programms;

public class InfiniteArray {
//run as run configuration and in argument pass the arguments
	public static void main(String[] args) {
		int sum=0;
		System.out.println(args.length);
		for(int i=1;i<args.length;i++)
		{
			System.out.println(args[i]);
			sum=sum+Integer.parseInt(args[i]);
		}
		System.out.println(sum);

	}

}
