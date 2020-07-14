
public class Method {
	
	public static void main(String[] args)
{
		
		StringBuffer s=new StringBuffer();
		//first time capicty double
		//s.append("11111111111111111");
		System.out.println(s.capacity());
		
		s.append("mangal");
	
		System.out.println(s.insert(0, "Arpit"));

		System.out.println(s.insert(s.length(), "Programmer"));
		System.out.println(s.delete(9, 16));
		System.out.println(s.deleteCharAt(0));
		System.out.println(s.charAt(0));
		System.out.println(s.substring(2,5));
		
		String tt=s.toString();
		String y=String.valueOf(s);
		System.out.println(y);
}
}
