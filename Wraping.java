
public class Wraping{

	public static void main(String[] args)
	{
	//Autoboxing -autobboxing is a convert primitive data type to its respective wrapper class
		int i=10;
		Integer j=i;
		System.out.println(j);
		Wraping k =new Wraping();
		System.out.println(j.equals(k));
		
		float x=19;
		Float y=x;
		System.out.println(y);
		double r=191;
		Double R=r;
		
	System.out.println(R);
	
	char c='a';
     Character a=c;
     System.out.println(a.hashCode());

     //Unboxing- unboxing is the process convert wrapper class to its respected primitive data type 
     
     
     Integer i1= 1431;
     int i2=i1;
     System.out.println(i2);
     
     Float f1=553f;
     float f2=f1;
     System.out.println(f2);
     
     Double d1=  1212.0;
     double d2=d1;
     System.out.println(d2);
		
	}
	
}
