import java.util.Scanner;

public class CompareMethod {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String t1=sc.next();
		  System.out.println("enter second string");
		  String t2=sc.next();
	
	if(t1.compareToIgnoreCase(t2)>=1)
	{
		System.out.println(t1 + " is greater");
	}

	else if(t1.compareToIgnoreCase(t2)<=-1)
		
	{
		System.out.println(t2 + " is greater");
	}
	
	else 
	{
		System.out.println(" both are eual");
	}
	}

}
