
public class New {

   public static void main(String[] args)
   {
	   String s="Arpit";
	   String t=s.concat("mangal");
	   String y=t.concat("Programmer");
	   
	   System.out.println(s);

	   System.out.println(t);

	   System.out.println(y);
	   
	   
	   StringBuilder ss=new StringBuilder();
	   ss.append("Arpit");
	   ss.append("mangal");
	   ss.append("programmer");
	   System.out.println(ss);
   }
}
