package java_Programms;

public class PrintCharacterAndItsFreq {

	public static void main(String[] args) {
		String s="aabbaabc";
		System.out.println("String: "+s);
		for(int i=0;i<s.length();i++)
		{
			char p=s.charAt(i);
			int count=1;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(j)==p)
				{
					count++;
				}
					
				else
				{
					i=i+count-1;
					break;
				}
					
			}
			System.out.print(p+""+count);
		}

	}

}
