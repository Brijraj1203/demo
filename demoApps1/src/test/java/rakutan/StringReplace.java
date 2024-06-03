package rakutan;

public class StringReplace {

	public static void main(String[] args) {
		String s="Jhony Jhony Yes papa";
		System.out.println(s);
//		String f = s.replace('J', 't');
//		System.out.println(f);
//		s=f.replace('p', 'n');
//		System.out.println(s);
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='J')
				s1=s1+'t';
			else if(s.charAt(i)=='p')
				s1=s1+'n';
			else
				s1=s1+s.charAt(i);
		}
		System.out.println("New String: "+s1);

	}

}
