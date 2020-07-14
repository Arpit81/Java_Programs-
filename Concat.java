
public class Concat {

	public static void main(String[] args) {
	
		// String 
		String S="Arpit";
		S.concat(S);
		System.out.println(S);
	
		//using String Builder
	StringBuilder sb=new StringBuilder("Arpit");
	sb.append("Mangal");
	System.out.println(sb);
	
	//using StrngBuffer
	StringBuffer sk=new StringBuffer("Arpit");
	sk.append("Mangal");
	System.out.println(sk);
	
}
}