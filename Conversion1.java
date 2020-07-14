import java.util.Scanner;

public class Conversion1 {
	
public static void main(String[] args)
{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first string");
	String tt=sc.next();
	
	System.out.println("enter Secound  string");
	String th=sc.next();
    int i=Integer.parseInt(tt);
    int j=Integer.parseInt(th);  
    System.out.println(i+j);
}
}
